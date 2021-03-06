package MrFreezze10117275.Tugas_AKB_10117275;

import java.io.Serializable;

/**
 * TANGGAL PENGERJAAN: 07 MEI 2020
 * NIM      : 10117275
 * NAMA     : MUHAMMAD FARIZ RAHMAN
 * KELAS    : IF-8
 */

public class Sms implements Serializable {

    public static final Integer SENT = 0;
    public static final Integer RECEIVED = 1;
    private Integer _id;
    private String _header;
    private String _content;
    private Integer _contactId;
    private Integer _type;

    public Sms() {
    }

    public Sms(String header, String content, Integer contactId, Integer type) {
        this._header = header;
        this._content = content;
        this._contactId = contactId;
        this._type = type;
    }

    public Integer getId() {
        return _id;
    }

    public String getHeader() {
        return _header;
    }

    public String getContent() {
        return _content;
    }

    public Integer getContactId() {
        return _contactId;
    }

    public Integer getType() {
        return _type;
    }

    public void setId(Integer id) {
        this._id = id;
    }

    public void setHeader(String header) {
        this._header = header;
    }

    public void setContent(String content) {
        this._content = content;
    }

    public void setContactId(Integer contactId) {
        this._contactId = contactId;
    }

    public void setType(Integer type) {
        this._type = type;
    }
}

package MrFreezze10117275.Tugas_AKB_10117275;

import android.graphics.Bitmap;

/**
 * TANGGAL PENGERJAAN: 07 MEI 2020
 * NIM      : 10117275
 * NAMA     : MUHAMMAD FARIZ RAHMAN
 * KELAS    : IF-8
 */

public class ContactData {

    private String _name;
    private String _phone;
    private Bitmap _image;

    public ContactData(String name, String phone, Bitmap image) {
        this._name = name;
        this._phone = phone;
        this._image = image;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getPhone() {
        return _phone;
    }

    public void setPhone(String phone) {
        this._phone = phone;
    }

    public Bitmap getImage() {
        return _image;
    }

    public void setImage(Bitmap image) {
        this._image = image;
    }

}

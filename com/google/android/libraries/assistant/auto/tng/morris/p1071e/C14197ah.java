package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ah */
/* compiled from: PG */
public final class C14197ah {
    /* renamed from: a */
    public static /* synthetic */ String m30574a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "DATAREQUESTTYPE_NOT_SET" : "CONTACT_PHONE_NUMBER_REQUEST" : "FAVORITE_CONTACTS_REQUEST" : "CONTACT_PHOTO_REQUEST" : "CONTACT_NAME_REQUEST";
    }

    /* renamed from: b */
    public static int m30575b(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }
}

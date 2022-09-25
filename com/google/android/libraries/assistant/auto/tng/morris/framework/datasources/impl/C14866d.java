package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ContentUris;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.ContactsContract;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14636z;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.d */
/* compiled from: PG */
public final /* synthetic */ class C14866d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C14878h f44749a;

    /* renamed from: b */
    public final /* synthetic */ String f44750b;

    public /* synthetic */ C14866d(C14878h hVar, String str) {
        this.f44749a = hVar;
        this.f44750b = str;
    }

    public final Object apply(Object obj) {
        C14361gj c;
        C14878h hVar = this.f44749a;
        String str = this.f44750b;
        C58485gu guVar = (C58485gu) obj;
        if (!guVar.isEmpty()) {
            Bitmap bitmap = null;
            try {
                InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(hVar.f44772g, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, ((C14636z) guVar.get(0)).f44234c));
                if (openContactPhotoInputStream != null) {
                    bitmap = C15375c.m31984b(BitmapFactory.decodeStream(openContactPhotoInputStream));
                    try {
                        openContactPhotoInputStream.close();
                    } catch (IOException e) {
                        C59104x c2 = C14878h.f44766a.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "Morris.ContactDataSrc");
                        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(45490)).mo56386p("IOException while closing stream");
                    }
                }
            } catch (SecurityException e2) {
                C59104x c3 = C14878h.f44766a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "Morris.ContactDataSrc");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(45491)).mo56386p("Could not get contact photo");
            }
            if (!(bitmap == null || (c = C15375c.m31985c(bitmap)) == null)) {
                hVar.f44770e.put(str, c);
                return C14782b.SUCCESS;
            }
        }
        return C14782b.SUCCESS;
    }
}

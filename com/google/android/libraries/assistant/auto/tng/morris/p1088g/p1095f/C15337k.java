package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.content.ContentUris;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.ContactsContract;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.k */
/* compiled from: PG */
public final /* synthetic */ class C15337k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C15340n f46030a;

    /* renamed from: b */
    public final /* synthetic */ long f46031b;

    public /* synthetic */ C15337k(C15340n nVar, long j) {
        this.f46030a = nVar;
        this.f46031b = j;
    }

    public final Object call() {
        C15340n nVar = this.f46030a;
        Bitmap bitmap = null;
        try {
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(nVar.f46035b, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, this.f46031b));
            if (openContactPhotoInputStream == null) {
                C59104x b = C15340n.f46034a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "Morris.ContactPhoto");
                ((C59052c) ((C59052c) b).mo56372aa(46051)).mo56386p("Stream is null");
            } else {
                Bitmap decodeStream = BitmapFactory.decodeStream(openContactPhotoInputStream);
                try {
                    openContactPhotoInputStream.close();
                } catch (IOException e) {
                    C59104x c = C15340n.f46034a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "Morris.ContactPhoto");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(46053)).mo56386p("IOException while closing closeable");
                }
                bitmap = C15375c.m31984b(decodeStream);
            }
        } catch (SecurityException e2) {
            C59104x c2 = C15340n.f46034a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "Morris.ContactPhoto");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(46052)).mo56386p("Could not get contact photo");
        }
        return Optional.ofNullable(bitmap);
    }
}

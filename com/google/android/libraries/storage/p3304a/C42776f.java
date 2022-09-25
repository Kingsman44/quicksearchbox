package com.google.android.libraries.storage.p3304a;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.p3313g.C42799b;
import com.google.android.libraries.storage.p3304a.p3313g.C42802e;
import com.google.android.libraries.storage.p3304a.p3313g.C42803f;
import com.google.android.libraries.storage.p3304a.p3313g.C42805h;
import com.google.common.p4522b.C58557jl;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.a.f */
/* compiled from: PG */
public final class C42776f {

    /* renamed from: a */
    public final C42813k f112038a;

    /* renamed from: b */
    public final C42799b f112039b;

    /* renamed from: c */
    public final List f112040c;

    /* renamed from: d */
    public final List f112041d;

    /* renamed from: e */
    public final Uri f112042e;

    /* renamed from: f */
    public final Uri f112043f;

    public C42776f(C42772e eVar) {
        this.f112038a = eVar.f112028a;
        this.f112039b = eVar.f112029b;
        this.f112040c = eVar.f112030c;
        this.f112041d = eVar.f112031d;
        this.f112042e = eVar.f112032e;
        this.f112043f = eVar.f112033f;
    }

    /* renamed from: a */
    public final List mo45871a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        if (!this.f112041d.isEmpty()) {
            List<C42803f> list = this.f112041d;
            Uri uri = this.f112042e;
            ArrayList arrayList2 = new ArrayList();
            for (C42803f b : list) {
                C42802e b2 = b.mo34690b(uri);
                if (b2 != null) {
                    arrayList2.add(b2);
                }
            }
            C42769d dVar = !arrayList2.isEmpty() ? new C42769d(outputStream, arrayList2) : null;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        for (C42805h b3 : this.f112040c) {
            arrayList.add(b3.mo45880b(this.f112042e, (OutputStream) C58557jl.m90131l(arrayList)));
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public final boolean mo45872b() {
        return !this.f112040c.isEmpty();
    }
}

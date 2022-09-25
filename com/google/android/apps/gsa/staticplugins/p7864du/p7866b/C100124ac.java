package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import android.database.Cursor;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.store.C118302a;
import com.google.android.apps.gsa.store.C118308af;
import com.google.android.apps.gsa.store.C118311b;
import com.google.android.apps.gsa.store.C118332u;
import com.google.android.apps.gsa.store.C118336y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.ac */
/* compiled from: PG */
final class C100124ac extends C100123ab {

    /* renamed from: b */
    private final C58485gu f279958b;

    /* renamed from: c */
    private final C100187m f279959c;

    /* renamed from: d */
    private final C100181g f279960d;

    /* renamed from: e */
    private final int f279961e;

    /* renamed from: f */
    private final int f279962f;

    /* renamed from: g */
    private final int f279963g;

    /* renamed from: h */
    private final boolean f279964h;

    public C100124ac(Cursor cursor, C58485gu guVar, C118831d dVar, C100187m mVar, C100181g gVar, boolean z) {
        super(cursor, dVar);
        this.f279958b = guVar;
        int i = -1;
        this.f279961e = z ? cursor.getColumnIndexOrThrow("blob") : -1;
        this.f279962f = z ? cursor.getColumnIndexOrThrow("blob_path") : i;
        this.f279963g = cursor.getColumnIndexOrThrow("blob_key");
        this.f279959c = mVar;
        this.f279960d = gVar;
        this.f279964h = z;
    }

    /* renamed from: d */
    private final int m165929d(Cursor cursor, C118336y yVar) {
        StringBuilder sb = new StringBuilder();
        C100164bp.m165989b(yVar, false).mo91779a(C58836b.f156633a, C58833ax.m90834k(this.f279959c), sb, new ArrayList());
        return cursor.getColumnIndexOrThrow(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo91754b(Cursor cursor) {
        long j;
        C58881cr crVar;
        int i;
        C118311b bVar;
        Cursor cursor2 = cursor;
        String string = cursor2.getString(this.f279963g);
        String string2 = this.f279964h ? cursor2.getString(this.f279962f) : null;
        if (string2 != null) {
            crVar = this.f279960d.mo91783a(new File(string2));
            long length = (long) string2.length();
            j = length + length;
        } else {
            j = 0;
            if (this.f279964h) {
                byte[] blob = cursor2.getBlob(this.f279961e);
                crVar = new C58885cv(blob);
                if (blob != null) {
                    j = (long) blob.length;
                }
            } else {
                crVar = new C58885cv((Object) null);
            }
        }
        C118831d dVar = this.f279953a;
        if (dVar != null) {
            if (string != null) {
                int length2 = string.length();
                j += (long) (length2 + length2);
            }
            dVar.mo104025g(j);
        }
        if (this.f279958b.isEmpty()) {
            return new C118332u(string, crVar, C118332u.f328460a);
        }
        HashMap hashMap = new HashMap();
        C58485gu guVar = this.f279958b;
        int i2 = ((C58724pq) guVar).f156474d;
        int i3 = 0;
        while (i3 < i2) {
            C118302a aVar = (C118302a) guVar.get(i3);
            if (cursor2.isNull(m165929d(cursor2, C118308af.m196469c(aVar)))) {
                i = i3;
            } else {
                int d = m165929d(cursor2, C118308af.m196478l(aVar));
                int d2 = m165929d(cursor2, C118308af.m196475i(aVar));
                int d3 = m165929d(cursor2, C118308af.m196473g(aVar));
                int d4 = m165929d(cursor2, C118308af.m196471e(aVar));
                C118831d dVar2 = this.f279953a;
                if (!cursor2.isNull(d)) {
                    String string3 = cursor2.getString(d);
                    if (dVar2 != null) {
                        int length3 = string3.length();
                        dVar2.mo104025g((long) (length3 + length3 + 8));
                    }
                    i = i3;
                    bVar = new C118311b(aVar, string3, (Long) null, (Double) null, (Boolean) null);
                } else {
                    i = i3;
                    if (!cursor2.isNull(d2)) {
                        if (dVar2 != null) {
                            dVar2.mo104025g(16);
                        }
                        bVar = C118311b.m196482a(aVar, cursor2.getLong(d2));
                    } else if (!cursor2.isNull(d3)) {
                        if (dVar2 != null) {
                            dVar2.mo104025g(16);
                        }
                        bVar = new C118311b(aVar, (String) null, (Long) null, Double.valueOf(cursor2.getDouble(d3)), (Boolean) null);
                    } else if (!cursor2.isNull(d4)) {
                        if (dVar2 != null) {
                            dVar2.mo104025g(9);
                        }
                        bVar = new C118311b(aVar, (String) null, (Long) null, (Double) null, Boolean.valueOf(cursor2.getLong(d4) == 1));
                    } else {
                        throw new IllegalStateException("AttributeValue is missing a non-null value");
                    }
                }
                hashMap.put(aVar, bVar);
            }
            i3 = i + 1;
        }
        return new C118332u(string, crVar, hashMap);
    }
}

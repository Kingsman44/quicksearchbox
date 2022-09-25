package com.google.android.libraries.notifications.platform.p2310d;

import com.google.common.base.C58890d;
import com.google.common.p4541l.C59332o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.google.android.libraries.notifications.platform.d.j */
/* compiled from: PG */
public abstract class C30087j {

    /* renamed from: e */
    public boolean f81419e;

    /* renamed from: a */
    public abstract C30088k mo35470a();

    /* renamed from: b */
    public abstract Map mo35471b();

    /* renamed from: c */
    public abstract byte[] mo35472c();

    /* renamed from: d */
    public abstract void mo35473d(byte[] bArr);

    /* renamed from: e */
    public abstract void mo35474e(Exception exc);

    /* renamed from: f */
    public final C30088k mo35486f() {
        if (this.f81419e) {
            mo35473d(mo35472c());
        } else {
            try {
                Map b = mo35471b();
                byte[] c = mo35472c();
                if (b.containsKey(C30084g.f81416a)) {
                    List list = (List) b.get(C30084g.f81416a);
                    if (!list.isEmpty()) {
                        if (C58890d.m90990e((CharSequence) list.get(0), "gzip")) {
                            c = C59332o.m92213d(new GZIPInputStream(new ByteArrayInputStream(c)));
                        }
                    }
                }
                mo35473d(c);
            } catch (IOException e) {
                mo35474e(e);
            }
        }
        return mo35470a();
    }
}

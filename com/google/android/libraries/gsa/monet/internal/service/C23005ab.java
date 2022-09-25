package com.google.android.libraries.gsa.monet.internal.service;

import android.os.Trace;
import com.google.android.libraries.gsa.monet.shared.C23125u;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;

/* renamed from: com.google.android.libraries.gsa.monet.internal.service.ab */
/* compiled from: PG */
public final class C23005ab {

    /* renamed from: a */
    public final C23021q f63275a;

    /* renamed from: b */
    public final C23025u f63276b;

    /* renamed from: c */
    public final C23125u f63277c;

    /* renamed from: d */
    private final C23020p f63278d;

    public C23005ab(C23021q qVar, C23020p pVar, C23025u uVar, C23125u uVar2) {
        this.f63275a = qVar;
        this.f63278d = pVar;
        this.f63276b = uVar;
        this.f63277c = uVar2;
    }

    /* renamed from: a */
    public static void m43093a(String str) {
        Trace.beginSection(str.substring(0, Math.min(127, str.length())));
    }

    /* renamed from: b */
    public final void mo28411b(C23129y yVar, ProtoParcelable protoParcelable) {
        try {
            if (this.f63277c.mo28573c()) {
                String str = yVar.f63477b;
                m43093a("ServiceUpdateReceiver.setRootFeature-" + str);
            }
            this.f63278d.mo28442a(yVar, protoParcelable);
            if (this.f63277c.mo28573c()) {
                Trace.endSection();
            }
        } catch (Throwable th) {
            if (this.f63277c.mo28573c()) {
                Trace.endSection();
            }
            throw th;
        }
    }
}

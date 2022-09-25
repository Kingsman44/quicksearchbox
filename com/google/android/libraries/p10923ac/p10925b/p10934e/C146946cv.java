package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146821r;
import com.google.protos.p4895aw.p4902b.C63998bh;

/* renamed from: com.google.android.libraries.ac.b.e.cv */
/* compiled from: PG */
public final class C146946cv implements C146844an {
    /* renamed from: a */
    public final /* synthetic */ Object mo123744a(Object obj, Object obj2) {
        return C146958dg.m239554e((C146821r) obj, ((C146958dg) obj2).mo123719a());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo123745b(Object obj, Object obj2) {
        C146958dg dgVar = (C146958dg) obj;
        C146958dg dgVar2 = (C146958dg) obj2;
        if (dgVar.mo123720b() < dgVar2.mo123720b()) {
            return false;
        }
        if (dgVar.mo123721c() != null && (dgVar2.mo123721c() == null || dgVar.mo123721c().longValue() < dgVar2.mo123721c().longValue())) {
            return false;
        }
        if (dgVar.mo123722d() == null) {
            return true;
        }
        if (dgVar2.mo123722d() == null || dgVar.mo123722d().longValue() > dgVar2.mo123722d().longValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo123746c(Object obj, Object obj2) {
        C146958dg dgVar = (C146958dg) obj;
        C63998bh bhVar = (C63998bh) obj2;
        if (dgVar.mo123722d() != null && dgVar.mo123722d().longValue() > bhVar.f173072d) {
            return false;
        }
        if (dgVar.mo123721c() == null || dgVar.mo123721c().longValue() >= bhVar.f173072d) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo123747d(Object obj) {
        C63998bh bhVar = (C63998bh) obj;
        return true;
    }
}

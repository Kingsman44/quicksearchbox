package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24273e;
import com.google.android.libraries.lens.ondevice.p2025e.C24435b;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62339dh;
import com.google.lens.p4701g.C62341dj;
import com.google.lens.p4701g.C62355r;
import com.google.protobuf.C62974ct;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.hg */
/* compiled from: PG */
public final class C24731hg extends C68247h {

    /* renamed from: a */
    private final C68283d f67603a;

    /* renamed from: c */
    private final C68283d f67604c;

    /* renamed from: d */
    private final C68283d f67605d;

    /* renamed from: e */
    private final C68283d f67606e;

    /* renamed from: f */
    private final C68283d f67607f;

    /* renamed from: g */
    private final C68283d f67608g;

    public C24731hg(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C24731hg.class), aVar);
        this.f67603a = C68236af.m98549d(dVar);
        this.f67604c = C68236af.m98549d(dVar2);
        this.f67605d = C68236af.m98549d(dVar3);
        this.f67606e = C68236af.m98549d(dVar4);
        this.f67607f = C68236af.m98549d(dVar5);
        this.f67608g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C62341dj djVar;
        C62341dj djVar2;
        List list = (List) obj;
        C62339dh dhVar = (C62339dh) list.get(0);
        C24555at atVar = (C24555at) list.get(1);
        C24735hk hkVar = (C24735hk) list.get(2);
        C24530h hVar = (C24530h) list.get(3);
        boolean booleanValue = ((Boolean) list.get(4)).booleanValue();
        C58833ax a = C24435b.m45508a((C58833ax) list.get(5));
        try {
            C24653ej.m45755b(C24725ha.class, hVar);
            if (hkVar.mo29986a().mo56113h()) {
                if (hkVar.mo29986a().equals(hkVar.mo29987b())) {
                    throw new IllegalStateException("Trying to translate to and from the same language: " + ((String) hkVar.mo29986a().mo56107c()));
                }
            }
            if (hkVar.mo29988c()) {
                if (!booleanValue) {
                    throw new IllegalStateException("Can't translate in auto-detect mode when not reloaded with the detected source language");
                }
            }
            C62355r a2 = atVar.mo29956a(dhVar);
            C24653ej.m45756c(C24725ha.class, hVar, a2);
            if (a2.f168334a == 11) {
                djVar = (C62341dj) a2.f168335b;
            } else {
                djVar = C62341dj.f168297b;
            }
            djVar.f168299a.size();
            C24435b.m45509b(a);
            if (a2.f168334a == 11) {
                djVar2 = (C62341dj) a2.f168335b;
            } else {
                djVar2 = C62341dj.f168297b;
            }
            return C60856cj.m92900i(djVar2);
        } catch (C24273e | C62974ct | IllegalStateException e) {
            C24653ej.m45754a(C24725ha.class, hVar);
            e.toString();
            C24435b.m45509b(a);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67603a.mo60297gq(), this.f67604c.mo60297gq(), this.f67605d.mo60297gq(), this.f67606e.mo60297gq(), this.f67607f.mo60297gq(), this.f67608g.mo60297gq());
    }
}

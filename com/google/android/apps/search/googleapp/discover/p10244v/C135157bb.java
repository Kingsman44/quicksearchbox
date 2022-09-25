package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10214s.C134556au;
import com.google.android.apps.search.googleapp.discover.p10214s.C134558aw;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4580v.C60950i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71803m;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.bb */
/* compiled from: PG */
public final class C135157bb implements C135173br {

    /* renamed from: a */
    public static final C59071e f368135a = C59071e.m91331h();

    /* renamed from: b */
    public final C135130ab f368136b;

    /* renamed from: c */
    public final C62921ba f368137c;

    /* renamed from: d */
    public final C60950i f368138d;

    /* renamed from: e */
    public final C69585o f368139e;

    /* renamed from: f */
    public final C135155b f368140f;

    /* renamed from: g */
    public final C134755f f368141g;

    public C135157bb(C135130ab abVar, C62921ba baVar, C60950i iVar, C69585o oVar, C135155b bVar, C134755f fVar) {
        this.f368136b = abVar;
        this.f368137c = baVar;
        this.f368138d = iVar;
        this.f368139e = oVar;
        this.f368140f = bVar;
        this.f368141g = fVar;
    }

    /* renamed from: a */
    public final C134556au mo112132a(String str, C135205y yVar) {
        C134556au auVar;
        Optional b = yVar.mo112164b(this.f368141g);
        if (b.isPresent()) {
            C62921ba baVar = this.f368137c;
            auVar = (C134556au) C62942bv.parseFrom((C62942bv) C134556au.f366435f, (byte[]) b.get(), baVar);
        } else {
            auVar = C134556au.f366435f;
        }
        C69664n.m101060f(auVar, "if (sessionBytes.isPrese…tate.getDefaultInstance()");
        if (str != null) {
            C134558aw awVar = auVar.f366438b;
            if (awVar == null) {
                awVar = C134558aw.f366443h;
            }
            if (!C69664n.m101066l(awVar.f366448d, str)) {
                C59052c cVar = (C59052c) f368135a.mo56226d();
                C134558aw awVar2 = auVar.f366438b;
                if (awVar2 == null) {
                    awVar2 = C134558aw.f366443h;
                }
                String str2 = awVar2.f366448d;
                cVar.mo56379ah(new C59094n(40417));
                cVar.mo56354G("Aborted change, target feed %s does not match current feed %s", str, str2);
                throw new C135174bs("Change aborted due to target feed mismatch");
            }
        }
        return auVar;
    }

    /* renamed from: b */
    public final Object mo112133b(C69577g gVar) {
        return C71803m.m105040a(this.f368139e, new C135148at(this, (C69577g) null), gVar);
    }

    /* renamed from: c */
    public final Object mo112134c(C69577g gVar) {
        return this.f368136b.mo112130b(new C135149au(this), gVar);
    }

    /* renamed from: d */
    public final String mo112135d(C135205y yVar) {
        Optional b = yVar.mo112164b(this.f368141g);
        if (!b.isPresent()) {
            return null;
        }
        C62921ba baVar = this.f368137c;
        C134558aw awVar = ((C134556au) C62942bv.parseFrom((C62942bv) C134556au.f366435f, (byte[]) b.get(), baVar)).f366438b;
        if (awVar == null) {
            awVar = C134558aw.f366443h;
        }
        return awVar.f366448d;
    }
}

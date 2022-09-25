package com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9693a;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.C128257b;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52271lo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C62995dn;
import com.google.protos.p5124m.p5125a.C65603f;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.a.c */
/* compiled from: PG */
public final class C128248c implements C128257b {

    /* renamed from: a */
    private static final C59071e f352761a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.a.c");

    /* renamed from: b */
    private final C65603f f352762b;

    /* renamed from: c */
    private final C65603f f352763c;

    /* renamed from: d */
    private final C65603f f352764d;

    /* renamed from: e */
    private final C65603f f352765e;

    public C128248c(C65603f fVar, C65603f fVar2, C65603f fVar3, C65603f fVar4) {
        this.f352762b = fVar;
        this.f352763c = fVar2;
        this.f352764d = fVar3;
        this.f352765e = fVar4;
    }

    /* renamed from: a */
    public final boolean mo108384a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        String str = intent.getPackage();
        if (this.f352762b.f178307a.contains(action)) {
            return false;
        }
        if (this.f352763c.f178307a.contains(action) || this.f352764d.f178307a.contains(str) || intent.getBooleanExtra("opa_allow_launch_intent_on_lockscreen", false)) {
            return true;
        }
        if (intent.getStringExtra("interactive_element") != null) {
            String stringExtra = intent.getStringExtra("interactive_element");
            if (C59326i.f157517e.mo56829i((CharSequence) Objects.requireNonNull(stringExtra))) {
                try {
                    C51805du duVar = ((C51016dg) C62942bv.parseFrom((C62942bv) C51016dg.f132827g, C59326i.f157516d.mo56836k(stringExtra), C62921ba.m95368a())).f132833e;
                    if (duVar == null) {
                        duVar = C51805du.f135924e;
                    }
                    C62995dn dnVar = duVar.f135929d;
                    if (dnVar.containsKey("tap_input")) {
                        if (this.f352765e.f178307a.contains(((C52271lo) C62942bv.parseFrom((C62942bv) C52271lo.f137214c, ((C52230ka) dnVar.get("tap_input")).f137061c, C62921ba.m95368a())).f137217b)) {
                            return true;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (C62974ct e) {
                    ((C59052c) ((C59052c) ((C59052c) f352761a.mo56225c()).mo56382g(e)).mo56372aa(37828)).mo56386p("Invalid interactive_element to parse.");
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return false;
    }
}

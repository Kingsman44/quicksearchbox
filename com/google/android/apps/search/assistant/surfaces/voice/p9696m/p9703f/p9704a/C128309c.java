package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9703f.p9704a;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126977d;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.C128245a;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.libraries.search.assistant.performer.p2728a.C35467c;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52141gt;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.f.a.c */
/* compiled from: PG */
public final class C128309c implements C35472h {

    /* renamed from: a */
    public static final C59071e f352896a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.m.f.a.c");

    /* renamed from: b */
    public final C126977d f352897b;

    /* renamed from: c */
    public final C37215b f352898c;

    /* renamed from: d */
    public final C127289i f352899d;

    /* renamed from: e */
    private final C128245a f352900e;

    /* renamed from: f */
    private final Executor f352901f;

    public C128309c(Executor executor, C126977d dVar, C37215b bVar, C128245a aVar, C127289i iVar) {
        this.f352900e = aVar;
        this.f352901f = executor;
        this.f352897b = dVar;
        this.f352898c = bVar;
        this.f352899d = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C52232kc kcVar;
        this.f352898c.mo19974a(C37176a.f97182gi);
        if (dyVar.f135936b.equals("device.WAIT_FOR_AUTHENTICATION")) {
            ((C59052c) ((C59052c) f352896a.mo56224b()).mo56372aa(37847)).mo56389s("Performing clientOp in WaitForAuthenticationPerformer %s", dyVar);
            C52141gt gtVar = C52141gt.f136816c;
            try {
                C51807dw dwVar = dyVar.f135938d;
                if (dwVar == null) {
                    dwVar = C51807dw.f135930b;
                }
                Iterator it = dwVar.f135932a.iterator();
                do {
                    if (it.hasNext()) {
                        kcVar = (C52232kc) it.next();
                    } else {
                        throw new C35467c("wait_for_authentication_args");
                    }
                } while (!"wait_for_authentication_args".equals(kcVar.f137065b));
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                byte[] N = ((C52141gt) C62942bv.parseFrom((C62942bv) C52141gt.f136816c, kaVar.f137061c, C62921ba.m95368a())).f136819b.mo59174N();
                this.f352898c.mo19974a(C37176a.f97187gn);
                return C47633f.m84733g(this.f352900e.mo108383a((Intent) null)).mo51516i(new C128307a(this, N), this.f352901f).mo51514f(Exception.class, new C128308b(this, dyVar), this.f352901f);
            } catch (C35467c | C62974ct e) {
                this.f352898c.mo19974a(C37176a.f97186gm.mo40805c(C62722b.INVALID_ARGUMENT));
                return C60856cj.m92899h(e);
            }
        } else {
            this.f352898c.mo19974a(C37176a.f97186gm.mo40805c(C62722b.INVALID_ARGUMENT));
            throw new C35471g(String.format("Unexpected ClientOpName. Expected %1$s, but got %2$s", new Object[]{"device.WAIT_FOR_AUTHENTICATION", dyVar.f135936b}));
        }
    }
}

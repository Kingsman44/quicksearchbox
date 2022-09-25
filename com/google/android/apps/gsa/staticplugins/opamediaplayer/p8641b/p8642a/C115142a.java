package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b.p8642a;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28290h;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.ajs;
import com.google.common.p4552o.ajt;
import com.google.common.p4552o.aju;
import com.google.common.p4552o.ajv;
import com.google.common.p4552o.alu;
import com.google.common.p4552o.alv;
import com.google.common.p4552o.alw;
import com.google.common.p4552o.alx;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.b.a.a */
/* compiled from: PG */
public final class C115142a implements C28290h {
    /* renamed from: c */
    public static void m190819c(C60321oe oeVar, C58833ax axVar, int i) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        C60555uf ufVar2 = (C60555uf) tzVar.build();
        if (axVar.mo56113h()) {
            C60320od odVar = (C60320od) oeVar.toBuilder();
            aqp aqp = (aqp) aqs.f159780k.createBuilder();
            aqm aqm = oeVar.f163230e;
            if (aqm == null) {
                aqm = aqm.f159760n;
            }
            int i2 = aqm.f159765d;
            aqp.copyOnWrite();
            aqs aqs = (aqs) aqp.instance;
            aqs.f159782a |= 1;
            aqs.f159783b = i2;
            C62940bt btVar = ajv.f158916d;
            ajs ajs = (ajs) ajv.f158915c.createBuilder();
            ajt ajt = (ajt) aju.f158911c.createBuilder();
            boolean z = ((C115466j) axVar.mo56107c()).f320310e;
            ajt.copyOnWrite();
            aju aju = (aju) ajt.instance;
            aju.f158913a |= 1;
            aju.f158914b = z;
            ajs.copyOnWrite();
            ajv ajv = (ajv) ajs.instance;
            aju aju2 = (aju) ajt.build();
            aju2.getClass();
            ajv.f158919b = aju2;
            ajv.f158918a |= 1;
            aqp.mo58885m(btVar, (ajv) ajs.build());
            odVar.mo57082b(aqp);
            oeVar = (C60321oe) odVar.build();
        }
        C89949q.m146525j(ufVar2, oeVar, (C63196b) null, (String) null);
    }

    /* renamed from: d */
    public static void m190820d(int i, String str, C62910ar arVar) {
        C28292j jVar = new C28292j(i);
        jVar.mo33795i(2);
        jVar.mo33794h(1);
        C60321oe j = C28285c.m52883j(jVar, 2, (Integer) null);
        if (j != null) {
            C60320od odVar = (C60320od) j.toBuilder();
            odVar.copyOnWrite();
            ((C60321oe) odVar.instance).f163228c = C60321oe.emptyProtobufList();
            aqp aqp = (aqp) aqs.f159780k.createBuilder();
            aqm aqm = j.f163230e;
            if (aqm == null) {
                aqm = aqm.f159760n;
            }
            int i2 = aqm.f159765d;
            aqp.copyOnWrite();
            aqs aqs = (aqs) aqp.instance;
            aqs.f159782a |= 1;
            aqs.f159783b = i2;
            C62940bt btVar = alx.f159112f;
            alw alw = (alw) alx.f159111e.createBuilder();
            alu alu = (alu) alv.f159107c.createBuilder();
            alu.copyOnWrite();
            alv alv = (alv) alu.instance;
            str.getClass();
            alv.f159109a |= 1;
            alv.f159110b = str;
            alw.copyOnWrite();
            alx alx = (alx) alw.instance;
            alv alv2 = (alv) alu.build();
            alv2.getClass();
            alx.f159116c = alv2;
            alx.f159115b = 1;
            alw.copyOnWrite();
            alx alx2 = (alx) alw.instance;
            arVar.getClass();
            alx2.f159117d = arVar;
            alx2.f159114a = 2 | alx2.f159114a;
            aqp.mo58885m(btVar, (alx) alw.build());
            odVar.mo57083c((aqs) aqp.build());
            C89949q.m146525j((C60555uf) null, (C60321oe) odVar.build(), (C63196b) null, (String) null);
        }
    }

    /* renamed from: e */
    public static final void m190821e(View view, C58833ax axVar, int i) {
        C58976aa aaVar = C58975e.f156826a;
        C60321oe i2 = C28285c.m52882i(view, 5, (Integer) null);
        if (i2 != null) {
            m190819c(i2, axVar, i);
        }
    }

    /* renamed from: f */
    public static final void m190822f(View view, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        C60321oe i = C28285c.m52882i(view, 31, (Integer) null);
        if (i != null) {
            m190819c(i, axVar, 1387);
        }
    }

    /* renamed from: g */
    public static void m190823g(int i, View view) {
        C60321oe h = C28285c.m52881h(i, C28295m.m52916b(view), (View) null);
        if (h == null) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C89949q.m146525j((C60555uf) null, h, (C63196b) null, (String) null);
        }
    }

    /* renamed from: a */
    public final void mo33783a(View view) {
        m190823g(3, view);
    }

    /* renamed from: b */
    public final void mo33784b(View view) {
        m190823g(2, view);
    }
}

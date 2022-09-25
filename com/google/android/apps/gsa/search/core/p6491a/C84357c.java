package com.google.android.apps.gsa.search.core.p6491a;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87761cp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87768cw;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.android.libraries.gsa.conversation.p1855h.C22689ab;
import com.google.android.libraries.gsa.conversation.p1855h.C22697b;
import com.google.android.libraries.gsa.conversation.p1855h.C22707k;
import com.google.android.libraries.gsa.conversation.p1855h.C22709m;
import com.google.android.libraries.gsa.conversation.p1855h.C22717u;
import com.google.android.libraries.gsa.conversation.p1855h.C22721y;
import com.google.android.libraries.gsa.conversation.p1855h.C22722z;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60003j;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.search.core.a.c */
/* compiled from: PG */
public abstract class C84357c implements C84378x {

    /* renamed from: a */
    public static final C58528ij f229586a = C58528ij.m90015O("call.CALL", "device.TAKE_PHOTO", "media.NEXT", "media.PAUSE", "media.PREVIOUS", "media.RESUME", "media.STOP");

    /* renamed from: j */
    private static void m134594j(C58833ax axVar, C87761cp cpVar) {
        C22717u uVar = (C22717u) ((C58847bk) axVar).f156646a;
        if (uVar.mo27832b() == 1) {
            String c = uVar.mo27836c();
            cpVar.copyOnWrite();
            C87768cw cwVar = (C87768cw) cpVar.instance;
            C87768cw cwVar2 = C87768cw.f237526k;
            c.getClass();
            cwVar.f237528a |= 4;
            cwVar.f237531d = c;
        } else if (uVar.mo27832b() == 2) {
            C60218r a = uVar.mo27831a();
            cpVar.copyOnWrite();
            C87768cw cwVar3 = (C87768cw) cpVar.instance;
            C87768cw cwVar4 = C87768cw.f237526k;
            a.getClass();
            cwVar3.f237535h = a;
            cwVar3.f237528a |= 64;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo77896a(C89857g gVar);

    /* renamed from: b */
    public final void mo77897b(String str, List list) {
        if (!list.isEmpty()) {
            Collection.EL.stream(list).filter(C84339a.f229549a).findFirst().ifPresent(new C84351b(this));
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.CONVERSATION_DELTA_CLIENT_OPS_EXECUTED;
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            ajVar.mo57005b(list);
            C58480gp e = C58485gu.m89837e();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e.mo55395g(((C60003j) it.next()).f162168b);
            }
            if (!TextUtils.isEmpty(str)) {
                ajVar.copyOnWrite();
                C59687cb cbVar = (C59687cb) ajVar.instance;
                cbVar.f160062a |= 16;
                cbVar.f160129j = str;
                C58976aa aaVar = C58975e.f156826a;
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
            }
            fVar.f246203c = (C59687cb) ajVar.build();
            mo77896a(fVar.mo83699a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo77898c(C87768cw cwVar, C58833ax axVar);

    /* renamed from: d */
    public final void mo77899d(C22722z zVar) {
        C87761cp cpVar = (C87761cp) C87768cw.f237526k.createBuilder();
        cpVar.copyOnWrite();
        C87768cw cwVar = (C87768cw) cpVar.instance;
        int i = 2;
        cwVar.f237532e = 2;
        cwVar.f237528a |= 8;
        C22707k kVar = (C22707k) zVar;
        m134594j(kVar.f62504a, cpVar);
        C22721y yVar = C22721y.SUCCESS;
        int ordinal = kVar.f62505b.ordinal();
        if (ordinal != 0) {
            i = ordinal != 1 ? ordinal != 2 ? 1 : 4 : 3;
        }
        cpVar.copyOnWrite();
        C87768cw cwVar2 = (C87768cw) cpVar.instance;
        cwVar2.f237533f = i - 1;
        cwVar2.f237528a |= 16;
        String f = zVar.mo27879f();
        cpVar.copyOnWrite();
        C87768cw cwVar3 = (C87768cw) cpVar.instance;
        cwVar3.f237528a = 4 | cwVar3.f237528a;
        cwVar3.f237531d = f;
        C58485gu o = C22697b.m42245o(zVar);
        cpVar.copyOnWrite();
        C87768cw cwVar4 = (C87768cw) cpVar.instance;
        C62971cq cqVar = cwVar4.f237536i;
        if (!cqVar.mo58948c()) {
            cwVar4.f237536i = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) o, (List) cwVar4.f237536i);
        mo77898c((C87768cw) cpVar.build(), kVar.f62507d);
    }

    /* renamed from: e */
    public final void mo77900e(C58833ax axVar) {
        mo77904i(axVar, 3);
    }

    /* renamed from: f */
    public final void mo77901f(C22689ab abVar) {
        C87761cp cpVar = (C87761cp) C87768cw.f237526k.createBuilder();
        cpVar.copyOnWrite();
        C87768cw cwVar = (C87768cw) cpVar.instance;
        int i = 5;
        cwVar.f237532e = 5;
        cwVar.f237528a |= 8;
        C22721y yVar = C22721y.SUCCESS;
        int i2 = ((C22709m) abVar).f62510a - 1;
        if (i2 == 0) {
            i = 2;
        } else if (i2 == 1) {
            i = 3;
        } else if (i2 == 2) {
            i = 4;
        }
        cpVar.copyOnWrite();
        C87768cw cwVar2 = (C87768cw) cpVar.instance;
        cwVar2.f237534g = i - 1;
        cwVar2.f237528a |= 32;
        mo77898c((C87768cw) cpVar.build(), C58836b.f156633a);
    }

    /* renamed from: g */
    public final void mo77902g() {
        C87761cp cpVar = (C87761cp) C87768cw.f237526k.createBuilder();
        cpVar.copyOnWrite();
        C87768cw cwVar = (C87768cw) cpVar.instance;
        cwVar.f237532e = 4;
        cwVar.f237528a |= 8;
        mo77898c((C87768cw) cpVar.build(), C58836b.f156633a);
    }

    /* renamed from: h */
    public final void mo77903h(C51809dy dyVar, C58833ax axVar, C58833ax axVar2) {
        C87761cp cpVar = (C87761cp) C87768cw.f237526k.createBuilder();
        C63088z byteString = dyVar.toByteString();
        cpVar.copyOnWrite();
        C87768cw cwVar = (C87768cw) cpVar.instance;
        byteString.getClass();
        cwVar.f237528a |= 1;
        cwVar.f237529b = byteString;
        cpVar.copyOnWrite();
        C87768cw cwVar2 = (C87768cw) cpVar.instance;
        cwVar2.f237532e = 3;
        cwVar2.f237528a |= 8;
        if (axVar.mo56113h()) {
            String str = (String) axVar.mo56107c();
            cpVar.copyOnWrite();
            C87768cw cwVar3 = (C87768cw) cpVar.instance;
            str.getClass();
            cwVar3.f237528a |= 2;
            cwVar3.f237530c = str;
        }
        C58833ax axVar3 = C58836b.f156633a;
        if (axVar2.mo56113h()) {
            if (((C22434e) axVar2.mo56107c()).mo27594d().mo56113h()) {
                String str2 = (String) ((C22434e) axVar2.mo56107c()).mo27594d().mo56107c();
                cpVar.copyOnWrite();
                C87768cw cwVar4 = (C87768cw) cpVar.instance;
                str2.getClass();
                cwVar4.f237528a |= 4;
                cwVar4.f237531d = str2;
            }
            if (((C22434e) axVar2.mo56107c()).mo27592b().mo56113h() && ((C22585l) ((C22434e) axVar2.mo56107c()).mo27592b().mo56107c()).f62228b.mo56113h()) {
                C84349ah ahVar = (C84349ah) ((C22585l) ((C22434e) axVar2.mo56107c()).mo27592b().mo56107c()).f62228b.mo56107c();
                if (ahVar instanceof C84349ah) {
                    axVar3 = C58833ax.m90834k(ahVar.f229566a);
                }
            }
        }
        mo77898c((C87768cw) cpVar.build(), axVar3);
    }

    /* renamed from: i */
    public final void mo77904i(C58833ax axVar, int i) {
        C87761cp cpVar = (C87761cp) C87768cw.f237526k.createBuilder();
        cpVar.copyOnWrite();
        C87768cw cwVar = (C87768cw) cpVar.instance;
        cwVar.f237532e = 1;
        cwVar.f237528a |= 8;
        cpVar.copyOnWrite();
        C87768cw cwVar2 = (C87768cw) cpVar.instance;
        cwVar2.f237537j = i - 2;
        cwVar2.f237528a |= 128;
        m134594j(axVar, cpVar);
        mo77898c((C87768cw) cpVar.build(), C58836b.f156633a);
    }
}

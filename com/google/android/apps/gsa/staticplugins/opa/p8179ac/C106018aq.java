package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.android.apps.gsa.shared.p7066m.C90041ct;
import com.google.android.libraries.assistant.p1528m.p1529a.C18430o;
import com.google.android.libraries.assistant.p1528m.p1529a.C18431p;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3917i.p3918a.C51622on;
import com.google.assistant.p3897e.p3917i.p3918a.C51623oo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p386ak.C8402r;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63060fy;
import com.google.protobuf.C63063ga;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.aq */
/* compiled from: PG */
public final /* synthetic */ class C106018aq implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106023av f295970a;

    /* renamed from: b */
    public final /* synthetic */ String f295971b;

    /* renamed from: c */
    public final /* synthetic */ String f295972c;

    /* renamed from: d */
    public final /* synthetic */ String f295973d;

    public /* synthetic */ C106018aq(C106023av avVar, String str, String str2, String str3) {
        this.f295970a = avVar;
        this.f295971b = str;
        this.f295972c = str2;
        this.f295973d = str3;
    }

    public final void run() {
        C58833ax axVar;
        String str;
        C18430o oVar;
        C106023av avVar = this.f295970a;
        String str2 = this.f295971b;
        String str3 = this.f295972c;
        String str4 = this.f295973d;
        C106025ax axVar2 = avVar.f295980a;
        if (str4 == null) {
            C63060fy fyVar = (C63060fy) C63063ga.f170179c.createBuilder();
            fyVar.copyOnWrite();
            C63063ga gaVar = (C63063ga) fyVar.instance;
            gaVar.f170182b = 0;
            gaVar.f170181a = 1;
            axVar = C58833ax.m90834k((C63063ga) fyVar.build());
        } else {
            try {
                axVar = C58833ax.m90834k((C63063ga) axVar2.f296016n.mo17146d(str4, C63063ga.class));
            } catch (C8402r unused) {
                ((C18431p) axVar2.f296005c.mo56107c()).mo23961g(str2, C18430o.INVALID_ARGUMENT, str3, "parameter value is not valid, it should be a JSON data type.");
                if (axVar2.f296013k.mo79746e(C90041ct.f248695h)) {
                    axVar2.f296015m.mo95248b(((C63037fb) axVar2.f295989F.build()).getSerializedSize(), C18430o.INVALID_ARGUMENT, axVar2.f296024v);
                }
                axVar = C58836b.f156633a;
            }
        }
        if (axVar.mo56113h()) {
            C106025ax axVar3 = avVar.f295980a;
            C63063ga gaVar2 = (C63063ga) axVar.mo56107c();
            C18430o oVar2 = C18430o.UNKNOWN;
            if (axVar3.f295987D) {
                oVar = C18430o.BLOCKED;
                str = "The dialog has ended.";
            } else if (str3.isEmpty()) {
                oVar = C18430o.INVALID_ARGUMENT;
                str = "parameter key can not be empty.";
            } else if (!Collections.unmodifiableMap(Collections.unmodifiableMap(((C63037fb) axVar3.f295989F.instance).f170146a)).containsKey(str3) || !((C63063ga) Collections.unmodifiableMap(Collections.unmodifiableMap(((C63037fb) axVar3.f295989F.instance).f170146a)).get(str3)).equals(gaVar2)) {
                axVar3.f295989F.mo59079a(str3, gaVar2);
                if (avVar.f295980a.mo95218H(str2, str3)) {
                    if (avVar.f295980a.f296013k.mo79746e(C90041ct.f248691d)) {
                        avVar.f295980a.mo95216F(str2, str3);
                    } else {
                        avVar.f295980a.mo95215E(str2);
                    }
                    C51622on onVar = (C51622on) C51623oo.f134536c.createBuilder();
                    C63037fb fbVar = (C63037fb) avVar.f295980a.f295989F.build();
                    onVar.copyOnWrite();
                    C51623oo ooVar = (C51623oo) onVar.instance;
                    fbVar.getClass();
                    ooVar.f134539b = fbVar;
                    ooVar.f134538a |= 1;
                    avVar.f295980a.mo95212B((C51623oo) onVar.build());
                    return;
                }
                return;
            } else {
                oVar = C18430o.ALREADY_EXIST;
                str = "The parameter key and value already exist, no need to update.";
            }
            ((C18431p) axVar3.f296005c.mo56107c()).mo23961g(str2, oVar, str3, str);
            if (axVar3.f296013k.mo79746e(C90041ct.f248695h)) {
                axVar3.f296015m.mo95248b(((C63037fb) axVar3.f295989F.build()).getSerializedSize(), oVar, axVar3.f296024v);
            }
        }
    }
}

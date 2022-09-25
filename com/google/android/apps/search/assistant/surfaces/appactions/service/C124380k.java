package com.google.android.apps.search.assistant.surfaces.appactions.service;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4535g.C59203do;
import com.google.p386ak.C8396l;
import com.google.p386ak.C8398n;
import com.google.p386ak.C8400p;
import com.google.p386ak.C8401q;
import com.google.p386ak.C8404t;
import com.google.p386ak.p388b.C8331ae;
import com.google.p386ak.p388b.C8332af;
import com.google.p386ak.p388b.C8334ah;
import com.google.p386ak.p388b.C8336aj;
import com.google.protobuf.C62988dg;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63061fz;
import com.google.protobuf.C63063ga;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.search.assistant.surfaces.appactions.service.k */
/* compiled from: PG */
public final class C124380k {
    /* renamed from: a */
    public static boolean m203841a(C63063ga gaVar, C8398n nVar) {
        C63037fb fbVar;
        C63037fb fbVar2;
        C62988dg dgVar;
        C62988dg dgVar2;
        C62988dg dgVar3;
        if (gaVar == null && nVar == null) {
            return true;
        }
        if (gaVar == null || nVar == null) {
            return false;
        }
        int b = C63061fz.m96003b(gaVar.f170181a);
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0) {
            return nVar instanceof C8400p;
        } else {
            if (i == 1) {
                if ((nVar instanceof C8404t) && (nVar.mo17162h().f29256a instanceof Number)) {
                    if (nVar.mo17162h().mo17173a().doubleValue() == (gaVar.f170181a == 2 ? ((Double) gaVar.f170182b).doubleValue() : C59203do.f157270a)) {
                        return true;
                    }
                }
                return false;
            } else if (i == 2) {
                if ((nVar instanceof C8404t) && (nVar.mo17162h().f29256a instanceof String)) {
                    if (TextUtils.equals(nVar.mo17162h().mo17154d(), gaVar.f170181a == 3 ? (String) gaVar.f170182b : BuildConfig.FLAVOR)) {
                        return true;
                    }
                }
                return false;
            } else if (i == 3) {
                if ((nVar instanceof C8404t) && (nVar.mo17162h().f29256a instanceof Boolean)) {
                    if (nVar.mo17162h().mo17155e() == (gaVar.f170181a == 4 ? ((Boolean) gaVar.f170182b).booleanValue() : false)) {
                        return true;
                    }
                }
                return false;
            } else if (i != 4) {
                if (i == 5 && (nVar instanceof C8396l)) {
                    int a = nVar.mo17160f().mo17151a();
                    if (gaVar.f170181a == 6) {
                        dgVar = (C62988dg) gaVar.f170182b;
                    } else {
                        dgVar = C62988dg.f170043b;
                    }
                    if (a == dgVar.f170045a.size()) {
                        int i2 = 0;
                        while (true) {
                            if (gaVar.f170181a == 6) {
                                dgVar2 = (C62988dg) gaVar.f170182b;
                            } else {
                                dgVar2 = C62988dg.f170043b;
                            }
                            if (i2 >= dgVar2.f170045a.size()) {
                                return true;
                            }
                            if (gaVar.f170181a == 6) {
                                dgVar3 = (C62988dg) gaVar.f170182b;
                            } else {
                                dgVar3 = C62988dg.f170043b;
                            }
                            if (!m203841a((C63063ga) dgVar3.f170045a.get(i2), nVar.mo17160f().mo17153c(i2))) {
                                return false;
                            }
                            i2++;
                        }
                    }
                }
                return false;
            } else {
                if (nVar instanceof C8401q) {
                    int i3 = ((C8334ah) nVar.mo17161g().f29255a.keySet()).f29147a.f29163c;
                    if (gaVar.f170181a == 5) {
                        fbVar = (C63037fb) gaVar.f170182b;
                    } else {
                        fbVar = C63037fb.f170144b;
                    }
                    if (i3 == fbVar.f170146a.size()) {
                        if (gaVar.f170181a == 5) {
                            fbVar2 = (C63037fb) gaVar.f170182b;
                        } else {
                            fbVar2 = C63037fb.f170144b;
                        }
                        Map unmodifiableMap = Collections.unmodifiableMap(fbVar2.f170146a);
                        C8331ae aeVar = new C8331ae((C8332af) nVar.mo17161g().f29255a.entrySet());
                        while (aeVar.hasNext()) {
                            C8336aj a2 = aeVar.mo17064a();
                            if (!m203841a((C63063ga) unmodifiableMap.get(a2.f29157f), (C8398n) a2.f29159h)) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
        }
    }
}

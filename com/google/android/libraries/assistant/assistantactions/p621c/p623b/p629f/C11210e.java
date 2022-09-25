package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f;

import com.google.assistant.p3897e.p3917i.p3918a.C51254ax;
import com.google.assistant.p3897e.p3917i.p3918a.C51460in;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.f.e */
/* compiled from: PG */
public final class C11210e {
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = r1.f137066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r0 = com.google.common.base.C58833ax.m90834k((com.google.assistant.p3897e.p3917i.p3918a.C51411gs) com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) com.google.assistant.p3897e.p3917i.p3918a.C51411gs.f133914b, r0.f137061c));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.assistant.p3897e.p3921j.C52091ex m26589a(com.google.assistant.p3897e.p3921j.C52091ex r6) {
        /*
            com.google.protobuf.cq r0 = r6.f136712a
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "assistant.api.params.FocusParams"
            java.lang.String r3 = "asst.focus.params"
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r0.next()
            com.google.assistant.e.j.kc r1 = (com.google.assistant.p3897e.p3921j.C52232kc) r1
            java.lang.String r4 = r1.f137065b
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0006
            com.google.assistant.e.j.ka r4 = r1.f137066c
            if (r4 != 0) goto L_0x0024
            com.google.assistant.e.j.ka r4 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x0024:
            java.lang.String r4 = r4.f137060b
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0006
            com.google.assistant.e.j.ka r0 = r1.f137066c     // Catch:{ ct -> 0x0041 }
            if (r0 != 0) goto L_0x0032
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x0041 }
        L_0x0032:
            com.google.protobuf.z r0 = r0.f137061c     // Catch:{ ct -> 0x0041 }
            com.google.assistant.e.i.a.gs r1 = com.google.assistant.p3897e.p3917i.p3918a.C51411gs.f133914b     // Catch:{ ct -> 0x0041 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (com.google.protobuf.C63088z) r0)     // Catch:{ ct -> 0x0041 }
            com.google.assistant.e.i.a.gs r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51411gs) r0     // Catch:{ ct -> 0x0041 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ ct -> 0x0041 }
            goto L_0x0043
        L_0x0041:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0043:
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x008d
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.i.a.gs r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51411gs) r0
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.i.a.gq r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51409gq) r0
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.i.a.gs r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51411gs) r1
            com.google.protobuf.cq r1 = r1.f133916a
            int r1 = r1.size()
            r4 = 1
            if (r1 != r4) goto L_0x008d
            com.google.assistant.e.i.a.gp r1 = r0.mo53612a()
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.i.a.go r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51407go) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.assistant.e.i.a.gp r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51408gp) r4
            r5 = 3
            r4.f133912b = r5
            int r5 = r4.f133911a
            r5 = r5 | 2
            r4.f133911a = r5
            r0.mo53613b(r1)
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.i.a.gs r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51411gs) r0
            com.google.protobuf.z r0 = r0.toByteString()
            com.google.assistant.e.j.ex r6 = m26591c(r6, r3, r2, r0)
        L_0x008d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11210e.m26589a(com.google.assistant.e.j.ex):com.google.assistant.e.j.ex");
    }

    /* renamed from: b */
    public static C52091ex m26590b(C52091ex exVar, C51460in inVar) {
        return m26591c(exVar, "asst.communication.message", "assistant.api.params.MessageParams", inVar.toByteString());
    }

    /* renamed from: c */
    public static C52091ex m26591c(C52091ex exVar, String str, String str2, C63088z zVar) {
        C52090ew ewVar = (C52090ew) exVar.toBuilder();
        int size = ((C52091ex) ewVar.instance).f136712a.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (str.equals(ewVar.mo53789b(size).f137065b)) {
                    ewVar.mo53793f(size);
                    break;
                }
            } else {
                break;
            }
        }
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = str2;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        zVar.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = zVar;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        ewVar.mo53792e((C52232kc) kbVar.build());
        return (C52091ex) ewVar.build();
    }

    /* renamed from: d */
    public static C58833ax m26592d(C52091ex exVar) {
        for (C52232kc kcVar : exVar.f136712a) {
            if ("asst.communication.call".equals(kcVar.f137065b)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if ("assistant.api.params.CallParams".equals(kaVar.f137060b)) {
                    try {
                        C52230ka kaVar2 = kcVar.f137066c;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        return C58833ax.m90834k((C51254ax) C62942bv.parseFrom((C62942bv) C51254ax.f133434c, kaVar2.f137061c));
                    } catch (C62974ct unused) {
                        return C58836b.f156633a;
                    }
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: e */
    public static C58833ax m26593e(C52091ex exVar) {
        for (C52232kc kcVar : exVar.f136712a) {
            if ("asst.communication.message".equals(kcVar.f137065b)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if ("assistant.api.params.MessageParams".equals(kaVar.f137060b)) {
                    try {
                        C52230ka kaVar2 = kcVar.f137066c;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        return C58833ax.m90834k((C51460in) C62942bv.parseFrom((C62942bv) C51460in.f134052e, kaVar2.f137061c));
                    } catch (C62974ct unused) {
                        return C58836b.f156633a;
                    }
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: f */
    public static C58833ax m26594f(C52091ex exVar) {
        for (C52232kc kcVar : exVar.f136712a) {
            if ("asst.request.logging.params".equals(kcVar.f137065b)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if ("assistant.api.params.RequestLoggingParams".equals(kaVar.f137060b)) {
                    try {
                        C52230ka kaVar2 = kcVar.f137066c;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        return C58833ax.m90834k((C51536li) C62942bv.parseFrom((C62942bv) C51536li.f134316k, kaVar2.f137061c));
                    } catch (C62974ct unused) {
                        return C58836b.f156633a;
                    }
                }
            }
        }
        return C58836b.f156633a;
    }
}

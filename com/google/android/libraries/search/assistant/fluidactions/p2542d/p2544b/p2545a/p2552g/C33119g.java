package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g;

import com.google.assistant.p3897e.p3917i.p3918a.C51254ax;
import com.google.assistant.p3897e.p3917i.p3918a.C51407go;
import com.google.assistant.p3897e.p3917i.p3918a.C51408gp;
import com.google.assistant.p3897e.p3917i.p3918a.C51409gq;
import com.google.assistant.p3897e.p3917i.p3918a.C51411gs;
import com.google.assistant.p3897e.p3917i.p3918a.C51460in;
import com.google.assistant.p3897e.p3917i.p3918a.C51484jk;
import com.google.assistant.p3897e.p3917i.p3918a.C51485jl;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import java.util.Iterator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.g.g */
/* compiled from: PG */
public final class C33119g {
    /* renamed from: a */
    public static final C52091ex m61465a(C52091ex exVar) {
        Optional empty;
        Iterator it = exVar.f136712a.iterator();
        while (true) {
            if (!it.hasNext()) {
                empty = Optional.empty();
                break;
            }
            C52232kc kcVar = (C52232kc) it.next();
            if (m61471g(kcVar, "asst.focus.params", "assistant.api.params.FocusParams")) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    empty = Optional.m71637of((C51411gs) C62942bv.parseFrom((C62942bv) C51411gs.f133914b, kaVar.f137061c));
                } catch (C62974ct unused) {
                    empty = Optional.empty();
                }
            }
        }
        if (!empty.isPresent()) {
            return exVar;
        }
        C51409gq gqVar = (C51409gq) ((C51411gs) empty.get()).toBuilder();
        if (((C51411gs) gqVar.instance).f133916a.size() != 1) {
            return exVar;
        }
        C51407go goVar = (C51407go) gqVar.mo53612a().toBuilder();
        goVar.copyOnWrite();
        C51408gp gpVar = (C51408gp) goVar.instance;
        gpVar.f133912b = 3;
        gpVar.f133911a |= 2;
        gqVar.mo53613b(goVar);
        return m61467c(exVar, "asst.focus.params", "assistant.api.params.FocusParams", ((C51411gs) gqVar.build()).toByteString());
    }

    /* renamed from: b */
    public static C52091ex m61466b(C52091ex exVar, C51460in inVar) {
        return m61467c(exVar, "asst.communication.message", "assistant.api.params.MessageParams", inVar.toByteString());
    }

    /* renamed from: c */
    public static C52091ex m61467c(C52091ex exVar, String str, String str2, C63088z zVar) {
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
    public static Optional m61468d(C52091ex exVar) {
        for (C52232kc kcVar : exVar.f136712a) {
            if (m61471g(kcVar, "asst.communication.call", "assistant.api.params.CallParams")) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    return Optional.m71637of((C51254ax) C62942bv.parseFrom((C62942bv) C51254ax.f133434c, kaVar.f137061c));
                } catch (C62974ct unused) {
                    return Optional.empty();
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: e */
    public static Optional m61469e(C52091ex exVar) {
        for (C52232kc kcVar : exVar.f136712a) {
            if (m61471g(kcVar, "asst.communication.message", "assistant.api.params.MessageParams")) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    return Optional.m71637of((C51460in) C62942bv.parseFrom((C62942bv) C51460in.f134052e, kaVar.f137061c));
                } catch (C62974ct unused) {
                    return Optional.empty();
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: f */
    public static boolean m61470f(C52091ex exVar) {
        Optional empty;
        Iterator it = exVar.f136712a.iterator();
        while (true) {
            if (!it.hasNext()) {
                empty = Optional.empty();
                break;
            }
            C52232kc kcVar = (C52232kc) it.next();
            if (m61471g(kcVar, "asst.nga_params", "assistant.api.params.NgaParam")) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    empty = Optional.m71637of((C51485jl) C62942bv.parseFrom((C62942bv) C51485jl.f134149c, kaVar.f137061c, C62921ba.m95368a()));
                } catch (C62974ct unused) {
                    empty = Optional.empty();
                }
            }
        }
        if (empty.isPresent()) {
            C51484jk a = C51484jk.m86198a(((C51485jl) empty.get()).f134152b);
            if (a == null) {
                a = C51484jk.UNKNOWN;
            }
            if (a == C51484jk.NGA) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m61471g(C52232kc kcVar, String str, String str2) {
        if (!str.equals(kcVar.f137065b)) {
            return false;
        }
        C52230ka kaVar = kcVar.f137066c;
        if (kaVar == null) {
            kaVar = C52230ka.f137057d;
        }
        return str2.equals(kaVar.f137060b);
    }
}

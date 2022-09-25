package com.google.android.libraries.assistant.portable.p1584a.p1585a;

import android.text.TextUtils;
import com.google.assistant.p3897e.p3917i.p3918a.C51370fe;
import com.google.assistant.p3897e.p3917i.p3918a.C51371ff;
import com.google.assistant.p3897e.p3917i.p3918a.C51372fg;
import com.google.assistant.p3897e.p3917i.p3918a.C51373fh;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p5277z.p5282c.C68013c;
import com.google.p5277z.p5282c.C68014d;
import com.google.p5277z.p5282c.C68015e;
import com.google.p5277z.p5282c.C68016f;
import com.google.p5277z.p5282c.C68018h;
import com.google.p5277z.p5282c.C68022l;
import com.google.protos.p4850an.p4853b.C63359c;
import com.google.protos.p4850an.p4853b.C63360d;
import com.google.protos.p4850an.p4854c.C63407ah;
import com.google.protos.p4850an.p4854c.C63408ai;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.portable.a.a.d */
/* compiled from: PG */
public final class C19046d {
    /* renamed from: a */
    public static C52091ex m36495a(C52091ex exVar, String str) {
        return m36496b(exVar, str, m36501g(3));
    }

    /* renamed from: b */
    public static C52091ex m36496b(C52091ex exVar, String str, C68018h hVar) {
        C58833ax b = C19043a.m36479b(exVar);
        if (b.mo56113h()) {
            C51370fe feVar = (C51370fe) ((C51373fh) b.mo56107c()).toBuilder();
            for (int i = 0; i < ((C51373fh) feVar.instance).f133804a.size(); i++) {
                C51371ff ffVar = (C51371ff) feVar.mo53596a(i).toBuilder();
                for (int i2 = 0; i2 < ((C51372fg) ffVar.instance).f133797d.size(); i2++) {
                    C68013c cVar = (C68013c) ffVar.mo53600a(i2).toBuilder();
                    C61752n nVar = ((C68014d) cVar.instance).f184280c;
                    if (nVar == null) {
                        nVar = C61752n.f166808f;
                    }
                    C61751m mVar = (C61751m) nVar.toBuilder();
                    for (int i3 = 0; i3 < ((C61752n) mVar.instance).f166812c.size(); i3++) {
                        if (str.equals(mVar.mo58182a(i3).f166796d)) {
                            C68022l lVar = ((C68014d) cVar.instance).f184281d;
                            if (lVar == null) {
                                lVar = C68022l.f184294b;
                            }
                            C68015e eVar = (C68015e) lVar.toBuilder();
                            eVar.mo60077b(str, hVar);
                            C68022l lVar2 = (C68022l) eVar.build();
                            cVar.copyOnWrite();
                            C68014d dVar = (C68014d) cVar.instance;
                            lVar2.getClass();
                            dVar.f184281d = lVar2;
                            dVar.f184278a |= 4;
                            ffVar.mo53603d(i2, cVar);
                            feVar.mo53598c(i, ffVar);
                            return C19043a.m36478a(exVar, (C51373fh) feVar.build());
                        }
                    }
                }
            }
        }
        return exVar;
    }

    /* renamed from: c */
    public static C58833ax m36497c(C52091ex exVar, String str) {
        C58833ax axVar;
        C58833ax b = C19043a.m36479b(exVar);
        if (!b.mo56113h()) {
            return C58836b.f156633a;
        }
        for (C51372fg fgVar : ((C51373fh) b.mo56107c()).f133804a) {
            Iterator it = fgVar.f133797d.iterator();
            while (true) {
                if (it.hasNext()) {
                    C61752n nVar = ((C68014d) it.next()).f184280c;
                    if (nVar == null) {
                        nVar = C61752n.f166808f;
                    }
                    int i = 0;
                    while (true) {
                        if (i >= nVar.f166812c.size()) {
                            axVar = C58836b.f156633a;
                            break;
                        } else if (TextUtils.isEmpty(str) || !str.equals(((C61746h) nVar.f166812c.get(i)).f166796d)) {
                            i++;
                        } else {
                            C61748j jVar = ((C61746h) nVar.f166812c.get(i)).f166797e;
                            if (jVar == null) {
                                jVar = C61748j.f166800d;
                            }
                            axVar = C58833ax.m90834k(jVar);
                        }
                    }
                    if (axVar.mo56113h()) {
                        return axVar;
                    }
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: d */
    static C63359c m36498d(C52091ex exVar, String str) {
        C63360d dVar;
        C58833ax c = m36497c(exVar, str);
        if (!c.mo56113h() || ((C61748j) c.mo56107c()).f166802a != 4) {
            return (C63359c) C63360d.f171230f.createBuilder();
        }
        C61748j jVar = (C61748j) c.mo56107c();
        if (jVar.f166802a == 4) {
            dVar = (C63360d) jVar.f166803b;
        } else {
            dVar = C63360d.f171230f;
        }
        return (C63359c) dVar.toBuilder();
    }

    /* renamed from: e */
    static C63407ah m36499e(C52091ex exVar, String str) {
        C63408ai aiVar;
        C58833ax c = m36497c(exVar, str);
        if (!c.mo56113h() || ((C61748j) c.mo56107c()).f166802a != 5) {
            return (C63407ah) C63408ai.f171351e.createBuilder();
        }
        C61748j jVar = (C61748j) c.mo56107c();
        if (jVar.f166802a == 5) {
            aiVar = (C63408ai) jVar.f166803b;
        } else {
            aiVar = C63408ai.f171351e;
        }
        return (C63407ah) aiVar.toBuilder();
    }

    /* renamed from: f */
    static void m36500f(Map map, C51370fe feVar) {
        for (int i = 0; i < ((C51373fh) feVar.instance).f133804a.size(); i++) {
            C51371ff ffVar = (C51371ff) feVar.mo53596a(i).toBuilder();
            int size = ((C51372fg) ffVar.instance).f133797d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C68013c cVar = (C68013c) ffVar.mo53600a(i2).toBuilder();
                C61752n nVar = ((C68014d) cVar.instance).f184280c;
                if (nVar == null) {
                    nVar = C61752n.f166808f;
                }
                C61751m mVar = (C61751m) nVar.toBuilder();
                for (int i3 = 0; i3 < ((C61752n) mVar.instance).f166812c.size(); i3++) {
                    if (map.containsKey(mVar.mo58182a(i3).f166796d)) {
                        C61746h hVar = (C61746h) map.get(mVar.mo58182a(i3).f166796d);
                        hVar.getClass();
                        mVar.mo58188g(i3, hVar);
                    }
                }
                cVar.copyOnWrite();
                C68014d dVar = (C68014d) cVar.instance;
                C61752n nVar2 = (C61752n) mVar.build();
                nVar2.getClass();
                dVar.f184280c = nVar2;
                dVar.f184278a |= 2;
                ffVar.mo53603d(i2, cVar);
            }
            feVar.mo53598c(i, ffVar);
        }
    }

    /* renamed from: g */
    public static C68018h m36501g(int i) {
        C68016f fVar = (C68016f) C68018h.f184286c.createBuilder();
        fVar.copyOnWrite();
        C68018h hVar = (C68018h) fVar.instance;
        hVar.f184289b = i - 1;
        hVar.f184288a |= 16;
        return (C68018h) fVar.build();
    }
}

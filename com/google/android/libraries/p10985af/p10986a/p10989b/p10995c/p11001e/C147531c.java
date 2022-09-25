package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p11001e;

import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55928ab;
import com.google.p4184bj.p4193c.p4197c.C55943aq;
import com.google.p4184bj.p4193c.p4197c.C55944ar;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.af.a.b.c.e.c */
/* compiled from: PG */
public final class C147531c {
    /* renamed from: a */
    public static boolean m240535a(C55912b bVar, C55944ar arVar) {
        Iterator it = arVar.f148913b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C55943aq aqVar = (C55943aq) it.next();
            if (aqVar.f148906a == bVar.f148826V) {
                if (aqVar.f148907b) {
                    if ((arVar.f148912a & 1) != 0) {
                        int ordinal = bVar.ordinal();
                        if (ordinal == 3) {
                            C55928ab abVar = arVar.f148914c;
                            if (abVar == null) {
                                abVar = C55928ab.f148876d;
                            }
                            if ((abVar.f148878a & 1) != 0) {
                                C55928ab abVar2 = arVar.f148914c;
                                if (abVar2 == null) {
                                    abVar2 = C55928ab.f148876d;
                                }
                                if (abVar2.f148879b) {
                                    return true;
                                }
                            }
                        } else if (ordinal == 4) {
                            C55928ab abVar3 = arVar.f148914c;
                            if (abVar3 == null) {
                                abVar3 = C55928ab.f148876d;
                            }
                            if ((abVar3.f148878a & 2) != 0) {
                                C55928ab abVar4 = arVar.f148914c;
                                if (abVar4 == null) {
                                    abVar4 = C55928ab.f148876d;
                                }
                                if (!abVar4.f148880c) {
                                    return false;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m240536b(C55912b bVar, C55944ar arVar) {
        for (C55943aq aqVar : arVar.f148913b) {
            if (aqVar.f148906a == bVar.f148826V) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m240537c(C55912b bVar, C55944ar arVar) {
        for (C55943aq aqVar : arVar.f148913b) {
            if (aqVar.f148906a == bVar.f148826V) {
                return aqVar.f148908c;
            }
        }
        return false;
    }
}

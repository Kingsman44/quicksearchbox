package com.google.android.libraries.mdi.download.p2236d.p2242f;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29397eu;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.p2236d.C29172hf;
import com.google.android.libraries.mdi.download.p2236d.C29173hg;
import com.google.common.base.C58869cf;
import com.google.p4433bz.p4437b.C57909n;
import com.google.protobuf.C62974ct;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.f.x */
/* compiled from: PG */
public final class C29110x {
    /* renamed from: a */
    public static C29398ev m54033a(String str, Context context, C29658ia iaVar) {
        C29397eu euVar;
        List i = C58869cf.m90938d("|").mo56155i(str);
        C29172hf hfVar = C29172hf.NEW_FILE_KEY;
        int ordinal = C29173hg.m54127a(context, iaVar).ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (i.size() == 4) {
                    euVar = (C29397eu) C29398ev.f79698g.createBuilder();
                    String str2 = (String) i.get(0);
                    euVar.copyOnWrite();
                    C29398ev evVar = (C29398ev) euVar.instance;
                    str2.getClass();
                    evVar.f79700a |= 1;
                    evVar.f79701b = str2;
                    int parseInt = Integer.parseInt((String) i.get(1));
                    euVar.copyOnWrite();
                    C29398ev evVar2 = (C29398ev) euVar.instance;
                    evVar2.f79700a |= 2;
                    evVar2.f79702c = parseInt;
                    String str3 = (String) i.get(2);
                    euVar.copyOnWrite();
                    C29398ev evVar3 = (C29398ev) euVar.instance;
                    str3.getClass();
                    evVar3.f79700a |= 4;
                    evVar3.f79703d = str3;
                    int a = C29332dp.m54217a(Integer.parseInt((String) i.get(3)));
                    euVar.copyOnWrite();
                    C29398ev evVar4 = (C29398ev) euVar.instance;
                    int i2 = a - 1;
                    if (a != 0) {
                        evVar4.f79704e = i2;
                        evVar4.f79700a |= 8;
                    } else {
                        throw null;
                    }
                } else {
                    throw new C29109w("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
                }
            } else if (i.size() == 2) {
                euVar = (C29397eu) C29398ev.f79698g.createBuilder();
                String str4 = (String) i.get(0);
                euVar.copyOnWrite();
                C29398ev evVar5 = (C29398ev) euVar.instance;
                str4.getClass();
                evVar5.f79700a |= 4;
                evVar5.f79703d = str4;
                int a2 = C29332dp.m54217a(Integer.parseInt((String) i.get(1)));
                euVar.copyOnWrite();
                C29398ev evVar6 = (C29398ev) euVar.instance;
                int i3 = a2 - 1;
                if (a2 != 0) {
                    evVar6.f79704e = i3;
                    evVar6.f79700a |= 8;
                } else {
                    throw null;
                }
            } else {
                throw new C29109w("Bad-format serializedFileKey = s".concat(String.valueOf(str)));
            }
        } else if (i.size() == 5) {
            C29397eu euVar2 = (C29397eu) C29398ev.f79698g.createBuilder();
            String str5 = (String) i.get(0);
            euVar2.copyOnWrite();
            C29398ev evVar7 = (C29398ev) euVar2.instance;
            str5.getClass();
            evVar7.f79700a |= 1;
            evVar7.f79701b = str5;
            int parseInt2 = Integer.parseInt((String) i.get(1));
            euVar2.copyOnWrite();
            C29398ev evVar8 = (C29398ev) euVar2.instance;
            evVar8.f79700a |= 2;
            evVar8.f79702c = parseInt2;
            String str6 = (String) i.get(2);
            euVar2.copyOnWrite();
            C29398ev evVar9 = (C29398ev) euVar2.instance;
            str6.getClass();
            evVar9.f79700a |= 4;
            evVar9.f79703d = str6;
            int a3 = C29332dp.m54217a(Integer.parseInt((String) i.get(3)));
            euVar2.copyOnWrite();
            C29398ev evVar10 = (C29398ev) euVar2.instance;
            int i4 = a3 - 1;
            if (a3 != 0) {
                evVar10.f79704e = i4;
                evVar10.f79700a |= 8;
                if (i.get(4) != null && !((String) i.get(4)).isEmpty()) {
                    try {
                        C57909n nVar = (C57909n) C29111y.m54039b((String) i.get(4), C57909n.f154891b.getParserForType());
                        euVar2.copyOnWrite();
                        C29398ev evVar11 = (C29398ev) euVar2.instance;
                        nVar.getClass();
                        evVar11.f79705f = nVar;
                        evVar11.f79700a |= 16;
                    } catch (C62974ct e) {
                        throw new C29109w("Failed to deserialize key:".concat(String.valueOf(str)), e);
                    }
                }
                euVar = euVar2;
            } else {
                throw null;
            }
        } else {
            throw new C29109w("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
        }
        return (C29398ev) euVar.build();
    }

    /* renamed from: b */
    public static String m54034b(C29398ev evVar, Context context, C29658ia iaVar) {
        C29172hf hfVar = C29172hf.NEW_FILE_KEY;
        int ordinal = C29173hg.m54127a(context, iaVar).ordinal();
        if (ordinal == 0) {
            return m54035c(evVar);
        }
        if (ordinal == 1) {
            return m54037e(evVar);
        }
        if (ordinal != 2) {
            return m54035c(evVar);
        }
        return m54036d(evVar);
    }

    /* renamed from: c */
    public static String m54035c(C29398ev evVar) {
        StringBuilder sb = new StringBuilder(evVar.f79701b);
        sb.append("|");
        sb.append(evVar.f79702c);
        sb.append("|");
        sb.append(evVar.f79703d);
        sb.append("|");
        int a = C29332dp.m54217a(evVar.f79704e);
        if (a == 0) {
            a = 1;
        }
        sb.append(a - 1);
        return sb.toString();
    }

    /* renamed from: d */
    public static String m54036d(C29398ev evVar) {
        StringBuilder sb = new StringBuilder(evVar.f79703d);
        sb.append("|");
        int a = C29332dp.m54217a(evVar.f79704e);
        if (a == 0) {
            a = 1;
        }
        sb.append(a - 1);
        return sb.toString();
    }

    /* renamed from: e */
    public static String m54037e(C29398ev evVar) {
        String str;
        StringBuilder sb = new StringBuilder(evVar.f79701b);
        sb.append("|");
        sb.append(evVar.f79702c);
        sb.append("|");
        sb.append(evVar.f79703d);
        sb.append("|");
        int a = C29332dp.m54217a(evVar.f79704e);
        if (a == 0) {
            a = 1;
        }
        sb.append(a - 1);
        sb.append("|");
        if ((evVar.f79700a & 16) != 0) {
            C57909n nVar = evVar.f79705f;
            if (nVar == null) {
                nVar = C57909n.f154891b;
            }
            str = C29111y.m54042e(nVar);
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb.append(str);
        return sb.toString();
    }
}

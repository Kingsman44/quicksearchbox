package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p741e.C12108a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p741e.p742a.C12110b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.common.p897a.C13213i;
import com.google.android.libraries.assistant.auto.tng.common.p933q.p934a.C13317a;
import com.google.android.libraries.assistant.auto.tng.media.p1053d.C13990a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3917i.p3918a.C51444hy;
import com.google.assistant.p3897e.p3917i.p3918a.C51445hz;
import com.google.assistant.p3897e.p3917i.p3918a.C51447ia;
import com.google.assistant.p3897e.p3917i.p3918a.C51449ic;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.assistant.p3897e.p3917i.p3918a.C51452if;
import com.google.assistant.p3897e.p3917i.p3918a.C51454ih;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.bu */
/* compiled from: PG */
public final class C16515bu {

    /* renamed from: a */
    private static final C59071e f48490a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.bu");

    /* renamed from: b */
    private static final C58495hd f48491b;

    /* renamed from: c */
    private static final C58495hd f48492c;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(0, C51452if.UNKNOWN_STATE);
        gzVar.mo55429h(6, C51452if.BUFFERING);
        gzVar.mo55429h(7, C51452if.ERROR);
        gzVar.mo55429h(4, C51452if.FAST_FORWARDING);
        gzVar.mo55429h(2, C51452if.PAUSED);
        gzVar.mo55429h(3, C51452if.PLAYING);
        gzVar.mo55429h(5, C51452if.REWINDING);
        gzVar.mo55429h(10, C51452if.SKIPPING_TO_NEXT);
        gzVar.mo55429h(9, C51452if.SKIPPING_TO_PREVIOUS);
        gzVar.mo55429h(1, C51452if.STOPPED);
        f48491b = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(64L, C51454ih.FAST_FORWARD);
        gzVar2.mo55429h(2L, C51454ih.PAUSE);
        gzVar2.mo55429h(4L, C51454ih.PLAY);
        gzVar2.mo55429h(2048L, C51454ih.PLAY_FROM_SEARCH);
        gzVar2.mo55429h(8192L, C51454ih.PLAY_FROM_URI);
        gzVar2.mo55429h(8L, C51454ih.REWIND);
        gzVar2.mo55429h(256L, C51454ih.SEEK_TO);
        gzVar2.mo55429h(128L, C51454ih.SET_RATING);
        gzVar2.mo55429h(262144L, C51454ih.SET_REPEAT_MODE);
        gzVar2.mo55429h(2097152L, C51454ih.SHUFFLE);
        gzVar2.mo55429h(32L, C51454ih.SKIP_TO_NEXT);
        gzVar2.mo55429h(16L, C51454ih.SKIP_TO_PREVIOUS);
        gzVar2.mo55429h(4096L, C51454ih.SKIP_TO_QUEUE_ITEM);
        gzVar2.mo55429h(1L, C51454ih.STOP);
        f48492c = gzVar2.mo55427f(false);
    }

    /* renamed from: a */
    static C51450id m33515a(C58833ax axVar, C12108a aVar, PackageManager packageManager, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C13317a aVar2, C51449ic icVar, C12991i iVar, C69464a aVar3) {
        String str;
        C51447ia i;
        C51058ev evVar;
        ArrayList arrayList = new ArrayList();
        C51447ia i2 = m33523i(axVar, packageManager, axVar2, aVar2);
        if (i2 != null) {
            arrayList.add(i2);
            C51098gh ghVar = i2.f133982b;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            if (ghVar.f133012b == 1) {
                evVar = (C51058ev) ghVar.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            str = evVar.f132944b;
        } else {
            ((C59052c) ((C59052c) f48490a.mo56226d()).mo56372aa(46359)).mo56386p("Top active media session is null.");
            str = BuildConfig.FLAVOR;
        }
        for (C12110b bVar : aVar.mo20394c()) {
            String j = bVar.mo20421j();
            if (!TextUtils.isEmpty(j) && !str.equals(j) && (i = m33523i(C58833ax.m90834k(bVar), packageManager, axVar2, aVar2)) != null) {
                arrayList.add(i);
            }
        }
        C51444hy hyVar = (C51444hy) C51450id.f133992h.createBuilder();
        hyVar.mo53617b(arrayList);
        if (axVar3.mo56113h()) {
            C51098gh ghVar2 = (C51098gh) axVar3.mo56107c();
            hyVar.copyOnWrite();
            C51450id idVar = (C51450id) hyVar.instance;
            ghVar2.getClass();
            idVar.f133997d = ghVar2;
            idVar.f133994a |= 2;
        }
        if (axVar4.mo56113h()) {
            C51098gh ghVar3 = (C51098gh) axVar4.mo56107c();
            hyVar.copyOnWrite();
            C51450id idVar2 = (C51450id) hyVar.instance;
            ghVar3.getClass();
            idVar2.f133998e = ghVar3;
            idVar2.f133994a |= 4;
        }
        C12989g a = C12989g.m29225a(iVar.f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        if (a == C12989g.AUTO_EMBEDDED && ((Boolean) aVar3.mo17428b()).booleanValue()) {
            if (icVar == null || icVar.equals(C51449ic.f133990a)) {
                ((C59052c) ((C59052c) f48490a.mo56224b()).mo56372aa(46360)).mo56386p("No valid radio station metadata.");
            } else {
                hyVar.mo53619d(icVar);
            }
        }
        return (C51450id) hyVar.build();
    }

    /* renamed from: b */
    static C58833ax m33516b(C51450id idVar) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "media";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.MediaParams";
        C63088z byteString = idVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return C58833ax.m90834k((C52232kc) kbVar.build());
    }

    /* renamed from: c */
    static C58833ax m33517c(Map map, C12991i iVar) {
        C12989g a = C12989g.m29225a(iVar.f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        if (!map.containsKey(a)) {
            C59052c cVar = (C59052c) ((C59052c) f48490a.mo56226d()).mo56372aa(46363);
            C12989g a2 = C12989g.m29225a(iVar.f40385d);
            if (a2 == null) {
                a2 = C12989g.UNKNOWN;
            }
            cVar.mo56389s("StickyAppFetcher not provided for EntrySurface: %s", a2.name());
            return C58836b.f156633a;
        }
        C12989g a3 = C12989g.m29225a(iVar.f40385d);
        if (a3 == null) {
            a3 = C12989g.UNKNOWN;
        }
        return C58833ax.m90834k((C13990a) map.get(a3));
    }

    /* renamed from: d */
    static C60870cx m33518d(AccountId accountId, C13213i iVar) {
        return iVar.mo20978a(accountId);
    }

    /* renamed from: e */
    static C60870cx m33519e(C12108a aVar) {
        return aVar.mo20393b();
    }

    /* renamed from: f */
    static C60870cx m33520f(C58833ax axVar) {
        if (axVar.mo56113h()) {
            return ((C13990a) axVar.mo56107c()).mo21381a();
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: g */
    static C60870cx m33521g(C58833ax axVar) {
        if (axVar.mo56113h()) {
            return ((C13990a) axVar.mo56107c()).mo21382b();
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: h */
    static C60870cx m33522h(C58833ax axVar) {
        if (axVar.mo56113h()) {
            return ((C42876ab) axVar.mo56107c()).mo46042d();
        }
        return C60856cj.m92900i(C51449ic.f133990a);
    }

    /* renamed from: i */
    private static C51447ia m33523i(C58833ax axVar, PackageManager packageManager, C58833ax axVar2, C13317a aVar) {
        C51452if ifVar;
        C52568wo woVar = null;
        if (!axVar.mo56113h()) {
            return null;
        }
        C12110b bVar = (C12110b) axVar.mo56107c();
        C58495hd hdVar = f48491b;
        if (hdVar.containsKey(Integer.valueOf(bVar.mo20416f().getState()))) {
            ifVar = (C51452if) hdVar.get(Integer.valueOf(bVar.mo20416f().getState()));
        } else {
            ifVar = C51452if.UNKNOWN_STATE;
        }
        ifVar.getClass();
        long e = ((C12110b) axVar.mo56107c()).mo20414e();
        ArrayList arrayList = new ArrayList();
        C58800sl lA = f48492c.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if ((((Long) entry.getKey()).longValue() & e) != 0) {
                arrayList.add((C51454ih) entry.getValue());
            }
        }
        C51445hz hzVar = (C51445hz) C51447ia.f133979i.createBuilder();
        hzVar.copyOnWrite();
        C51447ia iaVar = (C51447ia) hzVar.instance;
        iaVar.f133985e = ifVar.f134016m;
        iaVar.f133981a |= 16;
        hzVar.mo53620a(arrayList);
        PackageManager packageManager2 = packageManager;
        C51098gh a = aVar.mo21022a(((C12110b) axVar.mo56107c()).mo20421j(), packageManager);
        if (a != null) {
            hzVar.copyOnWrite();
            C51447ia iaVar2 = (C51447ia) hzVar.instance;
            iaVar2.f133982b = a;
            iaVar2.f133981a |= 1;
        }
        if (axVar2.mo56113h()) {
            if (axVar.mo56113h()) {
                C12110b bVar2 = (C12110b) axVar.mo56107c();
                C52563wj wjVar = (C52563wj) C52568wo.f137992v.createBuilder();
                String k = bVar2.mo20422k();
                if (!TextUtils.isEmpty(k)) {
                    wjVar.copyOnWrite();
                    C52568wo woVar2 = (C52568wo) wjVar.instance;
                    k.getClass();
                    woVar2.f137994a |= 1;
                    woVar2.f137998e = k;
                }
                String h = bVar2.mo20418h();
                if (!TextUtils.isEmpty(h)) {
                    wjVar.copyOnWrite();
                    C52568wo woVar3 = (C52568wo) wjVar.instance;
                    h.getClass();
                    woVar3.f137994a |= 2;
                    woVar3.f137999f = h;
                }
                String g = bVar2.mo20417g();
                if (!TextUtils.isEmpty(g)) {
                    wjVar.copyOnWrite();
                    C52568wo woVar4 = (C52568wo) wjVar.instance;
                    g.getClass();
                    woVar4.f137994a |= 8;
                    woVar4.f138000g = g;
                }
                String i = bVar2.mo20420i();
                if (!TextUtils.isEmpty(i)) {
                    wjVar.copyOnWrite();
                    C52568wo woVar5 = (C52568wo) wjVar.instance;
                    i.getClass();
                    woVar5.f137994a |= 32;
                    woVar5.f138002i = i;
                }
                woVar = (C52568wo) wjVar.build();
            }
            if (woVar != null) {
                hzVar.copyOnWrite();
                C51447ia iaVar3 = (C51447ia) hzVar.instance;
                iaVar3.f133983c = woVar;
                iaVar3.f133981a |= 4;
            }
            long d = bVar.mo20413d();
            hzVar.copyOnWrite();
            C51447ia iaVar4 = (C51447ia) hzVar.instance;
            iaVar4.f133981a |= 256;
            iaVar4.f133988h = d;
            long c = bVar.mo20412c();
            hzVar.copyOnWrite();
            C51447ia iaVar5 = (C51447ia) hzVar.instance;
            iaVar5.f133981a |= 64;
            iaVar5.f133987g = c;
            long b = bVar.mo20411b();
            hzVar.copyOnWrite();
            C51447ia iaVar6 = (C51447ia) hzVar.instance;
            iaVar6.f133981a |= 32;
            iaVar6.f133986f = b;
        }
        return (C51447ia) hzVar.build();
    }
}

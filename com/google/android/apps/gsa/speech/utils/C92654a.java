package com.google.android.apps.gsa.speech.utils;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p395al.p408c.p414c.p416b.C8460ac;
import com.google.p395al.p408c.p414c.p416b.C8470am;
import com.google.p395al.p408c.p414c.p416b.C8513w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.speech.utils.a */
/* compiled from: PG */
public final class C92654a {

    /* renamed from: a */
    public static final Locale f258635a = Locale.US;

    /* renamed from: b */
    private static final C59071e f258636b = C59071e.m91332i("com.google.android.apps.gsa.speech.utils.a");

    /* renamed from: a */
    public static C8460ac m152604a(C8513w wVar, String str) {
        for (C8470am amVar : wVar.f29533c) {
            Iterator it = amVar.f29409a.iterator();
            while (true) {
                if (it.hasNext()) {
                    C8460ac acVar = (C8460ac) it.next();
                    if (acVar.f29383c.equals(str)) {
                        return acVar;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C8460ac m152605b(C8513w wVar, String str) {
        for (C8470am amVar : wVar.f29533c) {
            Iterator it = amVar.f29409a.iterator();
            while (true) {
                if (it.hasNext()) {
                    C8460ac acVar = (C8460ac) it.next();
                    if (acVar.f29383c.equals(str)) {
                        return acVar;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C8460ac m152606c(C8513w wVar, String str) {
        for (C8470am amVar : wVar.f29533c) {
            Iterator it = amVar.f29409a.iterator();
            while (true) {
                if (it.hasNext()) {
                    C8460ac acVar = (C8460ac) it.next();
                    Iterator it2 = acVar.f29384d.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((String) it2.next()).equals(str)) {
                                return acVar;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m152607d(String str, C8513w wVar) {
        for (C8470am amVar : wVar.f29533c) {
            Iterator it = amVar.f29409a.iterator();
            while (true) {
                if (it.hasNext()) {
                    C8460ac acVar = (C8460ac) it.next();
                    Iterator it2 = acVar.f29384d.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((String) it2.next()).equals(str)) {
                                return acVar.f29383c;
                            }
                        }
                    }
                }
            }
        }
        return str.contains("_") ? m152607d(str.substring(0, str.lastIndexOf(95)), wVar) : "en-001";
    }

    /* renamed from: e */
    public static String m152608e(C8513w wVar, String str) {
        for (C8470am amVar : wVar.f29533c) {
            Iterator it = amVar.f29409a.iterator();
            while (true) {
                if (it.hasNext()) {
                    C8460ac acVar = (C8460ac) it.next();
                    if (acVar.f29383c.equals(str)) {
                        return acVar.f29382b;
                    }
                }
            }
        }
        ((C59052c) ((C59052c) f258636b.mo56225c()).mo56372aa(13029)).mo56389s("No display name for: %s", str);
        return BuildConfig.FLAVOR;
    }

    /* renamed from: f */
    public static ArrayList m152609f(C8513w wVar) {
        ArrayList arrayList = new ArrayList();
        for (C8470am amVar : wVar.f29533c) {
            for (C8460ac acVar : amVar.f29409a) {
                arrayList.add(acVar.f29383c);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static ArrayList m152610g(C8513w wVar) {
        ArrayList arrayList = new ArrayList();
        for (C8470am amVar : wVar.f29533c) {
            for (C8460ac acVar : amVar.f29409a) {
                arrayList.add(acVar.f29382b);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static void m152611h(List list) {
        HashSet hashSet = new HashSet(list);
        list.clear();
        list.addAll(hashSet);
        Collections.sort(list);
    }

    /* renamed from: i */
    public static boolean m152612i(C8513w wVar, String str) {
        return !TextUtils.isEmpty(m152608e(wVar, str));
    }
}

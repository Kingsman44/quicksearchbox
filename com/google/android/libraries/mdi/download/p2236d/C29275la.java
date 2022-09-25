package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29338dv;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.la */
/* compiled from: PG */
public final /* synthetic */ class C29275la implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79329a;

    /* renamed from: b */
    public final /* synthetic */ C29398ev f79330b;

    /* renamed from: c */
    public final /* synthetic */ C29338dv f79331c;

    /* renamed from: d */
    public final /* synthetic */ List f79332d;

    /* renamed from: e */
    public final /* synthetic */ int f79333e;

    /* renamed from: f */
    public final /* synthetic */ int f79334f;

    public /* synthetic */ C29275la(C29290lp lpVar, C29398ev evVar, C29338dv dvVar, List list, int i, int i2) {
        this.f79329a = lpVar;
        this.f79330b = evVar;
        this.f79331c = dvVar;
        this.f79332d = list;
        this.f79333e = i;
        this.f79334f = i2;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79329a;
        C29398ev evVar = this.f79330b;
        C29338dv dvVar = this.f79331c;
        List list = this.f79332d;
        int i = this.f79333e;
        int i2 = this.f79334f;
        C29402ez ezVar = (C29402ez) obj;
        if (ezVar != null) {
            C29390en a = C29390en.m54308a(ezVar.f79715c);
            if (a == null) {
                a = C29390en.NONE;
            }
            if (a == C29390en.DOWNLOAD_COMPLETE) {
                Context context = lpVar.f79385a;
                int a2 = C29332dp.m54217a(evVar.f79704e);
                if (C29090d.m53984e(context, a2 == 0 ? 1 : a2, ezVar.f79714b, evVar.f79703d, lpVar.f79386b, lpVar.f79394j, false) != null) {
                    return C60856cj.m92900i(dvVar);
                }
            }
        }
        return lpVar.mo34645i(list, i + 1, i2);
    }
}

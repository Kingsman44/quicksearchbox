package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29338dv;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.delta.vcdiff.C29321a;
import com.google.android.libraries.mdi.download.p2236d.p2239c.C28917e;
import com.google.android.libraries.mdi.download.p2236d.p2239c.C28925m;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.ll */
/* compiled from: PG */
public final /* synthetic */ class C29286ll implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79365a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f79366b;

    /* renamed from: c */
    public final /* synthetic */ C29338dv f79367c;

    /* renamed from: d */
    public final /* synthetic */ C29328dl f79368d;

    /* renamed from: e */
    public final /* synthetic */ C29398ev f79369e;

    /* renamed from: f */
    public final /* synthetic */ C29392ep f79370f;

    /* renamed from: g */
    public final /* synthetic */ int f79371g;

    /* renamed from: h */
    public final /* synthetic */ long f79372h;

    /* renamed from: i */
    public final /* synthetic */ String f79373i;

    /* renamed from: j */
    public final /* synthetic */ C29380ed f79374j;

    /* renamed from: k */
    public final /* synthetic */ int f79375k;

    /* renamed from: l */
    public final /* synthetic */ List f79376l;

    public /* synthetic */ C29286ll(C29290lp lpVar, C60870cx cxVar, C29338dv dvVar, C29328dl dlVar, C29398ev evVar, C29392ep epVar, int i, long j, String str, C29380ed edVar, int i2, List list) {
        this.f79365a = lpVar;
        this.f79366b = cxVar;
        this.f79367c = dvVar;
        this.f79368d = dlVar;
        this.f79369e = evVar;
        this.f79370f = epVar;
        this.f79371g = i;
        this.f79372h = j;
        this.f79373i = str;
        this.f79374j = edVar;
        this.f79375k = i2;
        this.f79376l = list;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79365a;
        C60870cx cxVar = this.f79366b;
        C29338dv dvVar = this.f79367c;
        C29328dl dlVar = this.f79368d;
        C29398ev evVar = this.f79369e;
        C29392ep epVar = this.f79370f;
        int i = this.f79371g;
        long j = this.f79372h;
        String str = this.f79373i;
        C29380ed edVar = this.f79374j;
        int i2 = this.f79375k;
        List list = this.f79376l;
        Boolean bool = (Boolean) obj;
        Uri uri = (Uri) C60856cj.m92909r(cxVar);
        if (!lpVar.f79390f.mo56113h() || dvVar == null) {
            List list2 = list;
            int i3 = i2;
            long j2 = j;
            C29380ed edVar2 = edVar;
            String str2 = str;
            int i4 = i;
            C29392ep epVar2 = epVar;
            C29293ls lsVar = lpVar.f79387c;
            C42813k kVar = lpVar.f79389e;
            int a = C29332dp.m54217a(evVar.f79704e);
            C28925m mVar = new C28925m(lsVar, kVar, dlVar, a == 0 ? 1 : a, lpVar.f79392h, epVar2, i4, j2, str2, lpVar.f79393i, lpVar.f79395k);
            lpVar.mo34644h(epVar2, uri);
            return lpVar.f79388d.mo34510b(epVar2, i4, j2, str2, uri, dlVar.f79474c, dlVar.f79475d, edVar2, mVar, i3, list2);
        }
        Context context = lpVar.f79385a;
        C29293ls lsVar2 = lpVar.f79387c;
        long j3 = j;
        C42813k kVar2 = lpVar.f79389e;
        C29658ia iaVar = lpVar.f79386b;
        int a2 = C29332dp.m54217a(evVar.f79704e);
        List list3 = list;
        int i5 = i2;
        C29293ls lsVar3 = lsVar2;
        long j4 = j3;
        String str3 = str;
        int i6 = i;
        C29380ed edVar3 = edVar;
        C29392ep epVar3 = epVar;
        C28917e eVar = new C28917e(context, lsVar3, kVar2, iaVar, dlVar, a2 == 0 ? 1 : a2, (C29321a) lpVar.f79390f.mo56107c(), dvVar, lpVar.f79392h, epVar, i6, j4, str3, lpVar.f79394j, lpVar.f79393i, lpVar.f79395k);
        lpVar.mo34644h(epVar3, uri);
        C29338dv dvVar2 = dvVar;
        return lpVar.f79388d.mo34510b(epVar3, i6, j4, str3, uri, dvVar2.f79525b, dvVar2.f79526c, edVar3, eVar, i5, list3);
    }
}

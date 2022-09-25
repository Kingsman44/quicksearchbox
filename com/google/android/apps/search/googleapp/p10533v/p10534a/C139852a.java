package com.google.android.apps.search.googleapp.p10533v.p10534a;

import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58130a;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58131b;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58134e;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58135f;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.apps.search.googleapp.v.a.a */
/* compiled from: PG */
public final /* synthetic */ class C139852a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f380144a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f380145b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f380146c;

    /* renamed from: d */
    public final /* synthetic */ boolean f380147d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f380148e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f380149f;

    /* renamed from: g */
    public final /* synthetic */ boolean f380150g;

    public /* synthetic */ C139852a(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, boolean z, C60870cx cxVar4, C60870cx cxVar5, boolean z2) {
        this.f380144a = cxVar;
        this.f380145b = cxVar2;
        this.f380146c = cxVar3;
        this.f380147d = z;
        this.f380148e = cxVar4;
        this.f380149f = cxVar5;
        this.f380150g = z2;
    }

    public final Object call() {
        C60870cx cxVar = this.f380144a;
        C60870cx cxVar2 = this.f380145b;
        C60870cx cxVar3 = this.f380146c;
        boolean z = this.f380147d;
        C60870cx cxVar4 = this.f380148e;
        C60870cx cxVar5 = this.f380149f;
        boolean z2 = this.f380150g;
        C58130a aVar = (C58130a) C60856cj.m92909r(cxVar);
        try {
            C58490gz gzVar = new C58490gz(4);
            gzVar.mo55433l((Map) C60856cj.m92909r(cxVar2));
            gzVar.mo55433l((Map) C60856cj.m92909r(cxVar3));
            Iterator it = new HashSet(gzVar.mo55427f(false).values()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!C58837ba.m90859h(str)) {
                    aVar.mo54674c(str);
                }
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C139853b.f380151a.mo56226d()).mo56382g(e)).mo56372aa(40812)).mo56386p("Can't get server tokens");
        }
        if (z) {
            C58134e eVar = (C58134e) C58135f.f155417f.createBuilder();
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            eVar.copyOnWrite();
            C58135f fVar = (C58135f) eVar.instance;
            fVar.f155419a |= 1;
            fVar.f155420b = i;
            int i2 = displayMetrics.widthPixels;
            eVar.copyOnWrite();
            C58135f fVar2 = (C58135f) eVar.instance;
            fVar2.f155419a |= 2;
            fVar2.f155421c = i2;
            int i3 = displayMetrics.heightPixels;
            eVar.copyOnWrite();
            C58135f fVar3 = (C58135f) eVar.instance;
            fVar3.f155419a = 4 | fVar3.f155419a;
            fVar3.f155422d = i3;
            eVar.mo54677a(Arrays.asList(Build.SUPPORTED_ABIS));
            C58135f fVar4 = (C58135f) eVar.build();
            aVar.copyOnWrite();
            C58131b bVar = (C58131b) aVar.instance;
            C58131b bVar2 = C58131b.f155403h;
            fVar4.getClass();
            bVar.f155411g = fVar4;
            bVar.f155405a |= 16;
        }
        if (!((Boolean) C60856cj.m92909r(cxVar4)).booleanValue()) {
            aVar.mo54672a((Iterable) C60856cj.m92909r(cxVar5));
        }
        byte[] byteArray = ((C58131b) aVar.build()).toByteArray();
        if (z2) {
            C58130a aVar2 = (C58130a) C58131b.f155403h.createBuilder();
            C63087y v = C63088z.m96150v();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(v);
                gZIPOutputStream.write(byteArray);
                gZIPOutputStream.close();
            } catch (IOException e2) {
                ((C59052c) ((C59052c) ((C59052c) C139854c.f380156a.mo56226d()).mo56382g(e2)).mo56372aa(40813)).mo56386p("GZIP compress failure");
            }
            C63088z A = C63088z.m96139A(v.mo59165b().mo59174N());
            aVar2.copyOnWrite();
            C58131b bVar3 = (C58131b) aVar2.instance;
            bVar3.f155405a |= 1;
            bVar3.f155406b = A;
            byteArray = ((C58131b) aVar2.build()).toByteArray();
        }
        return Base64.encodeToString(byteArray, 10);
    }
}

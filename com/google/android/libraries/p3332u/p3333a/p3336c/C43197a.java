package com.google.android.libraries.p3332u.p3333a.p3336c;

import android.content.Context;
import com.google.android.gms.gmscompliance.p10800a.C144226a;
import com.google.android.gms.gmscompliance.p10800a.C144264d;
import com.google.android.gms.gmscompliance.p10800a.p10801a.C144261g;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10802a.C144231d;
import com.google.android.gms.gmscompliance.p10807b.C144272f;
import com.google.android.libraries.p3332u.p3333a.p3337d.C43198a;
import dagger.p5294a.C68220f;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.u.a.c.a */
/* compiled from: PG */
public final class C43197a implements C68220f {
    /* renamed from: a */
    public static C144264d m76181a(Context context, C43198a aVar) {
        C69664n.m101061g(context, "context");
        Executor executor = aVar.f112919a;
        C144231d dVar = C144231d.f390674a;
        String c = dVar.mo119777c();
        if (c != null) {
            int a = dVar.mo119775a();
            String b = dVar.mo119776b();
            if (b != null) {
                return new C144261g(new C144272f(context), context, executor, new C144226a(b, c, a));
            }
            throw new NullPointerException("Null udevsApiKey");
        }
        throw new NullPointerException("Null udevsHostName");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}

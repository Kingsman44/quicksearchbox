package com.google.android.libraries.web.weblayer.contrib.p3452a;

import android.content.Context;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.C44074i;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.weblayer.p3448b.C44127c;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.account.data.C46216k;
import com.google.apps.tiktok.account.data.C46217l;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.p3648i.p3653d.C47181e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60934v;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.a.s */
/* compiled from: PG */
public final class C44161s implements C46216k, C47181e {

    /* renamed from: a */
    public final C46175b f114904a;

    /* renamed from: b */
    public final C44315a f114905b;

    /* renamed from: c */
    public final C60887da f114906c;

    /* renamed from: d */
    public final C60887da f114907d;

    /* renamed from: e */
    public final C60888db f114908e;

    /* renamed from: f */
    private final Context f114909f;

    /* renamed from: g */
    private final C44127c f114910g;

    /* renamed from: com.google.android.libraries.web.weblayer.contrib.a.s$a */
    /* compiled from: PG */
    public interface C44162a {
        /* renamed from: gs */
        C44074i mo47111gs();
    }

    public C44161s(Context context, C46175b bVar, C60888db dbVar, C60887da daVar, C60887da daVar2, C44127c cVar, C44315a aVar) {
        this.f114909f = context;
        this.f114904a = bVar;
        this.f114905b = aVar;
        this.f114906c = daVar;
        this.f114907d = daVar2;
        this.f114908e = dbVar;
        this.f114910g = cVar;
    }

    /* renamed from: g */
    public static HashSet m77937g(File file) {
        HashSet hashSet = new HashSet();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File name : listFiles) {
                hashSet.add(name.getName());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final C60870cx mo47105a() {
        C60870cx a = this.f114910g.mo47087a();
        C44144b bVar = new C44144b(this);
        return C60922j.m93045h(a, C47810es.m84966f(bVar), this.f114907d);
    }

    /* renamed from: b */
    public final Profile mo47106b(AccountId accountId, C46215j jVar) {
        return ((C44162a) C47245e.m84045a(this.f114909f, C44162a.class, accountId)).mo47111gs().mo47041a(C43271v.WEB_LAYER, jVar);
    }

    /* renamed from: c */
    public final C60870cx mo47107c(C46217l lVar) {
        C60870cx a = this.f114910g.mo47087a();
        C44153k kVar = new C44153k(this, lVar);
        return C60922j.m93045h(a, C47810es.m84966f(kVar), this.f114907d);
    }

    /* renamed from: d */
    public final C60870cx mo47108d(String str) {
        return C47638k.m84752c((List) Collection.EL.stream(C58485gu.m89847o(new File(mo47110f(), str), new File(mo47109e(), str))).map(new C44143a(this)).collect(Collectors.toCollection(C44152j.f114891a))).mo51520a(new C60934v((Object) null), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final File mo47109e() {
        File cacheDir = this.f114909f.getCacheDir();
        String str = File.separator;
        return new File(cacheDir, "weblayer" + str + "profiles");
    }

    /* renamed from: f */
    public final File mo47110f() {
        return new File(this.f114909f.getDir("weblayer", 0), "profiles");
    }
}

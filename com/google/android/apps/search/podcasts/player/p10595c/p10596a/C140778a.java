package com.google.android.apps.search.podcasts.player.p10595c.p10596a;

import android.net.Uri;
import com.google.android.libraries.p1963i.p1964a.C23820c;
import com.google.android.p10890h.p10891a.p10893b.C146575f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.frameworks.client.data.android.p4632a.C61333a;
import com.google.frameworks.client.data.android.p4632a.C61343d;
import com.google.frameworks.client.data.android.p4632a.C61346g;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.search.podcasts.player.c.a.a */
/* compiled from: PG */
public final class C140778a implements C146575f {

    /* renamed from: a */
    public static final C58528ij f382260a = new C58759qy("https://www.googleapis.com/auth/youtube");

    /* renamed from: b */
    private static final C59071e f382261b = C59071e.m91332i("com.google.android.apps.search.podcasts.player.c.a.a");

    /* renamed from: d */
    private final C61343d f382262d;

    /* renamed from: e */
    private final C46128f f382263e;

    /* renamed from: f */
    private final AccountId f382264f;

    /* renamed from: g */
    private final C47770dh f382265g;

    public C140778a(C61343d dVar, C46128f fVar, AccountId accountId, C47770dh dhVar) {
        this.f382262d = dVar;
        this.f382263e = fVar;
        this.f382264f = accountId;
        this.f382265g = dhVar;
    }

    /* renamed from: a */
    public final int mo95061a(Uri uri, Map map) {
        HashMap hashMap;
        String str;
        C47538ax c = this.f382265g.mo51613c("QOE ping");
        try {
            hashMap = new HashMap(map);
            String str2 = (String) C23820c.m44352c(this.f382263e.mo50215b(this.f382264f), TimeUnit.MILLISECONDS);
            if (!(str2 == null || (str = this.f382262d.mo57912b(C61333a.m93820a(str2), f382260a).f165904a) == null)) {
                hashMap.put("Authorization", "Bearer " + str);
            }
        } catch (C61346g | InterruptedException | ExecutionException | TimeoutException e) {
            ((C59052c) ((C59052c) ((C59052c) f382261b.mo56225c()).mo56382g(e)).mo56372aa(41635)).mo56386p("Failed to get oauth token for qoe ping");
        } catch (Throwable th) {
            if (c != null) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
        int a = C146575f.f395842c.mo95061a(uri, hashMap);
        if (c != null) {
            c.close();
        }
        return a;
    }
}

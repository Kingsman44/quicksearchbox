package com.google.apps.tiktok.p3644h;

import android.accounts.NetworkErrorException;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.apps.tiktok.h.g */
/* compiled from: PG */
public final /* synthetic */ class C47130g implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C47130g f122734a = new C47130g();

    private /* synthetic */ C47130g() {
    }

    public final C60870cx apply(Object obj) {
        int i = C47134k.f122742f;
        return C60856cj.m92899h(new NetworkErrorException("Can't get auth token.", (IOException) obj));
    }
}

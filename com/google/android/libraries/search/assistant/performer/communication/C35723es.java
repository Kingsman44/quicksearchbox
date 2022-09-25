package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.apn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.es */
/* compiled from: PG */
public final class C35723es implements C35472h {

    /* renamed from: a */
    public static final C59071e f93626a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.es");

    /* renamed from: b */
    public final Context f93627b;

    /* renamed from: c */
    public final C35470f f93628c;

    /* renamed from: d */
    public final C60888db f93629d;

    /* renamed from: e */
    public final C46877q f93630e;

    /* renamed from: f */
    public final PackageManager f93631f;

    public C35723es(Context context, C60888db dbVar, C46877q qVar, PackageManager packageManager, C35470f fVar) {
        this.f93627b = context;
        this.f93628c = fVar;
        this.f93629d = dbVar;
        this.f93630e = qVar;
        this.f93631f = packageManager;
    }

    /* renamed from: b */
    public static void m64103b(boolean z, String str) {
        if (!z) {
            throw new C35471g(str);
        }
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        if (dyVar.f135936b.equals("video_call.CALL")) {
            ((C59052c) ((C59052c) f93626a.mo56224b()).mo56372aa(51709)).mo56389s("Performing clientOp in VideoCallPerformer %s", dyVar);
            C60870cx a = C36183e.m64583a(dyVar, "video_call_args", apn.f135563g.getParserForType(), new C35711eg(this));
            C35714ej ejVar = C35714ej.f93617a;
            return C60846c.m92878g(a, RuntimeException.class, C47810es.m84963c(ejVar), this.f93629d);
        }
        throw new C35471g(String.format("Unexpected ClientOpName. Expected %1$s, but got %2$s", new Object[]{"video_call.CALL", dyVar.f135936b}));
    }
}

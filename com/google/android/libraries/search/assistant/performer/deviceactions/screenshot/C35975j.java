package com.google.android.libraries.search.assistant.performer.deviceactions.screenshot;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.j */
/* compiled from: PG */
public final class C35975j implements C47102r {

    /* renamed from: a */
    private static final C59071e f94156a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.j");

    /* renamed from: b */
    private final C35966a f94157b;

    /* renamed from: c */
    private final Context f94158c;

    /* renamed from: d */
    private final C35973h f94159d;

    public C35975j(C35966a aVar, C35973h hVar, Context context) {
        this.f94157b = aVar;
        this.f94159d = hVar;
        this.f94158c = context;
    }

    /* renamed from: a */
    private static Intent m64357a(Uri uri) {
        return new Intent("android.intent.action.EDIT").setDataAndType(uri, "image/png").addFlags(1).addFlags(2).addFlags(268435456);
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        if (intent == null || intent.getAction() == null || intent.getData() == null) {
            return C60866ct.f164955a;
        }
        ((C59052c) ((C59052c) f94156a.mo56224b()).mo56372aa(52068)).mo56389s("onReceive(context, %s)", intent);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.DELETE_ACTION")) {
            this.f94159d.mo39911a();
            C35966a aVar = this.f94157b;
            Uri data = intent.getData();
            data.getClass();
            return aVar.mo39909a(data);
        } else if (!action.equals("com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.EDIT_ACTION")) {
            return C60866ct.f164955a;
        } else {
            this.f94159d.mo39911a();
            Context context = this.f94158c;
            Uri data2 = intent.getData();
            data2.getClass();
            Intent component = m64357a(data2).setComponent(ComponentName.createRelative("com.google.android.markup", ".AnnotateActivity"));
            if (context.getPackageManager().resolveActivity(component, 65536) == null) {
                component = m64357a(data2);
            }
            C47810es.m84979s(this.f94158c, component);
            return C60866ct.f164955a;
        }
    }
}

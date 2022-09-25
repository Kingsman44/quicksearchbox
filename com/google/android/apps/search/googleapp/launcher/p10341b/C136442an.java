package com.google.android.apps.search.googleapp.launcher.p10341b;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.an */
/* compiled from: PG */
public final class C136442an {

    /* renamed from: a */
    public static final C59071e f371471a = C59071e.m91332i("com.google.android.apps.search.googleapp.launcher.b.an");

    /* renamed from: b */
    public volatile C136433ae f371472b;

    /* renamed from: c */
    public final Service f371473c;

    /* renamed from: d */
    public final C136441am f371474d;

    public C136442an(Service service, C136441am amVar) {
        this.f371473c = service;
        this.f371474d = amVar;
    }

    /* renamed from: a */
    public static int m221736a(Intent intent, String str, String str2) {
        String queryParameter;
        Uri data = intent.getData();
        if (data == null || (queryParameter = data.getQueryParameter(str)) == null) {
            return Integer.MAX_VALUE;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException e) {
            ((C59052c) ((C59052c) ((C59052c) f371471a.mo56225c()).mo56382g(e)).mo56372aa(40767)).mo56389s("%s", str2);
            return Integer.MAX_VALUE;
        }
    }
}

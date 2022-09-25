package com.google.android.libraries.gsa.conversation.clientop.p1846f;

import android.app.KeyguardManager;
import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.gsa.conversation.p1855h.C22692ae;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.f.e */
/* compiled from: PG */
public final class C22473e {

    /* renamed from: a */
    public static final C59071e f62041a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.clientop.f.e");

    /* renamed from: b */
    public final C22695ah f62042b;

    /* renamed from: c */
    public final KeyguardManager f62043c;

    /* renamed from: d */
    public final C22692ae f62044d;

    public C22473e(C22695ah ahVar, Context context, C22692ae aeVar) {
        this.f62042b = ahVar;
        this.f62043c = (KeyguardManager) context.getSystemService("keyguard");
        this.f62044d = aeVar;
    }

    /* renamed from: a */
    public static Uri.Builder m41921a(C51592nk nkVar) {
        Uri.Builder appendPath = C22481m.f62054a.buildUpon().appendPath("multi");
        Uri.Builder builder = new Uri.Builder();
        m41922b(builder, nkVar);
        appendPath.appendQueryParameter("action", builder.build().toString());
        appendPath.appendQueryParameter("action", Uri.parse("/timer").buildUpon().appendPath(nkVar.f134467d).appendPath("view").build().toString());
        return appendPath;
    }

    /* renamed from: b */
    public static void m41922b(Uri.Builder builder, C51592nk nkVar) {
        long j;
        if (nkVar.f134465b == 4) {
            j = ((Long) nkVar.f134466c).longValue();
        } else {
            j = nkVar.f134469f;
        }
        builder.appendPath("timer").appendPath("create").appendQueryParameter("timerStatus", "Started").appendQueryParameter("length", Long.toString(j));
        if ((nkVar.f134464a & 1) != 0) {
            builder.appendQueryParameter("uuid", nkVar.f134467d);
        }
        if ((nkVar.f134464a & 32) != 0) {
            builder.appendQueryParameter("message", nkVar.f134470g);
        }
    }
}

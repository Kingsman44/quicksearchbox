package com.google.android.apps.gsa.staticplugins.avocado.p7420b;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.p7291a.C92421a;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.p7291a.C92422b;
import com.google.assistant.p3861at.C50375ut;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.b.g */
/* compiled from: PG */
public final /* synthetic */ class C94190g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C94194k f263168a;

    /* renamed from: b */
    public final /* synthetic */ C50375ut f263169b;

    /* renamed from: c */
    public final /* synthetic */ Uri f263170c;

    public /* synthetic */ C94190g(C94194k kVar, C50375ut utVar, Uri uri) {
        this.f263168a = kVar;
        this.f263169b = utVar;
        this.f263170c = uri;
    }

    public final void onClick(View view) {
        C94194k kVar = this.f263168a;
        C50375ut utVar = this.f263169b;
        Uri uri = this.f263170c;
        C92421a aVar = (C92421a) C92422b.f257764c.createBuilder();
        String str = utVar.f131129a;
        aVar.copyOnWrite();
        C92422b bVar = (C92422b) aVar.instance;
        str.getClass();
        bVar.f257766a |= 1;
        bVar.f257767b = str;
        C92422b bVar2 = (C92422b) aVar.build();
        String uri2 = uri.toString();
        C94189f fVar = new C94189f();
        Bundle arguments = kVar.getArguments();
        arguments.putString("parent_user_id", utVar.f131129a);
        arguments.putString("parent_email", utVar.f131131c);
        arguments.putString("parent_display_name", utVar.f131130b);
        arguments.putString("parent_image_uri", uri2);
        fVar.setArguments(arguments);
        kVar.f263183k.f257560e = bVar2;
        kVar.f263186n.f283241a = bVar2;
        kVar.mo88395e(2);
    }
}

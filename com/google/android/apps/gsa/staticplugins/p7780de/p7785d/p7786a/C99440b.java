package com.google.android.apps.gsa.staticplugins.p7780de.p7785d.p7786a;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.gsa.staticplugins.p7780de.p7783c.C99433b;
import com.google.android.apps.gsa.staticplugins.p7780de.p7783c.C99434c;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.d.a.b */
/* compiled from: PG */
public final /* synthetic */ class C99440b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C99442d f278254a;

    /* renamed from: b */
    public final /* synthetic */ Map f278255b;

    /* renamed from: c */
    public final /* synthetic */ C99433b f278256c;

    /* renamed from: d */
    public final /* synthetic */ Activity f278257d;

    /* renamed from: e */
    public final /* synthetic */ View f278258e;

    public /* synthetic */ C99440b(C99442d dVar, Map map, C99433b bVar, Activity activity, View view) {
        this.f278254a = dVar;
        this.f278255b = map;
        this.f278256c = bVar;
        this.f278257d = activity;
        this.f278258e = view;
    }

    public final void accept(Object obj) {
        C99442d dVar = this.f278254a;
        Map map = this.f278255b;
        C99433b bVar = this.f278256c;
        Activity activity = this.f278257d;
        View view = this.f278258e;
        String str = (String) obj;
        C99442d.f278262a = true;
        if (map.containsKey(str)) {
            boolean equals = true ^ str.equals("en-IN");
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            bundle.putString("hlParam", (String) map.get(str));
            bundle.putBoolean("shouldUpdateLanguageSetting", Boolean.valueOf(equals).booleanValue());
            ((C99434c) bVar).f278236a.mo28345s("onLanguageSelected_java.lang.String_java.lang.String_boolean", "SearchNowEventsDispatcher", bundle);
            if (equals) {
                Toast.makeText(activity, "Language Settings updated to ".concat(String.valueOf(Locale.forLanguageTag(str).getDisplayLanguage(Locale.ENGLISH))), 0).show();
            }
        }
        dVar.mo91457a(activity, view);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

package com.google.android.apps.search.googleapp.search.suggest.sources.p10463c;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.c.b */
/* compiled from: PG */
final /* synthetic */ class C138501b extends C69663m implements C69626l {
    public C138501b(Object obj) {
        super(1, obj, C138506g.class, "buildAppSuggestion", "buildAppSuggestion(Landroid/database/Cursor;)Lcom/google/android/apps/search/googleapp/search/suggest/SuggestionProto$Suggestion;", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Cursor cursor = (Cursor) obj;
        C69664n.m101061g(cursor, "p0");
        C138506g gVar = (C138506g) this.f186034c;
        int i = C138506g.f376742a;
        String string = cursor.getString(cursor.getColumnIndexOrThrow("suggest_text_1"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("suggest_icon_1"));
        Intent data = new Intent(cursor.getString(cursor.getColumnIndexOrThrow("suggest_intent_action"))).setData(Uri.parse(cursor.getString(cursor.getColumnIndexOrThrow("suggest_intent_data"))));
        C69664n.m101060f(data, "Intent(intentAction).set…ta(Uri.parse(intentData))");
        C69664n.m101060f(string, "appName");
        C69664n.m101060f(string2, "iconUri");
        return C138506g.m224929l(string, string2, data);
    }
}

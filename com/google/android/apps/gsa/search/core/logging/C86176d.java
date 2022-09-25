package com.google.android.apps.gsa.search.core.logging;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.apps.gsa.eventlogger.j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.search.core.p3548a.C45232b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.search.core.logging.d */
/* compiled from: PG */
public final class C86176d {

    /* renamed from: f */
    private static final C59071e f232864f = C59071e.m91332i("com.google.android.apps.gsa.search.core.logging.d");

    /* renamed from: a */
    public final Context f232865a;

    /* renamed from: b */
    public final C21370a f232866b;

    /* renamed from: c */
    public final j f232867c;

    /* renamed from: d */
    public C45232b f232868d;

    /* renamed from: e */
    public final Object f232869e = new Object();

    public C86176d(Context context, C21370a aVar, j jVar) {
        this.f232865a = context;
        this.f232866b = aVar;
        this.f232867c = jVar;
    }

    /* renamed from: a */
    public final C45232b mo79811a(SharedPreferences sharedPreferences) {
        if (this.f232868d == null) {
            C63010eb parserForType = C45232b.f118026b.getParserForType();
            MessageLite messageLite = null;
            String string = sharedPreferences.getString("aggregated_events", (String) null);
            if (string != null) {
                try {
                    byte[] decode = Base64.decode(string, 0);
                    if (decode != null) {
                        try {
                            messageLite = (MessageLite) parserForType.mo59015n(decode, C62921ba.m95368a());
                        } catch (C62974ct e) {
                            ((C59052c) ((C59052c) ((C59052c) f232864f.mo56225c()).mo56382g(e)).mo56372aa(8232)).mo56386p("Corrupted protocol buffer.");
                            sharedPreferences.edit().remove("aggregated_events").apply();
                        }
                    }
                } catch (Exception e2) {
                    ((C59052c) ((C59052c) ((C59052c) f232864f.mo56225c()).mo56382g(e2)).mo56372aa(8233)).mo56386p("Corrupted base64 string.");
                    sharedPreferences.edit().remove("aggregated_events").apply();
                }
            }
            this.f232868d = (C45232b) messageLite;
        }
        return this.f232868d;
    }
}

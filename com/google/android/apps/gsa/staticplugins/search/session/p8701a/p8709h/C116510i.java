package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Xml;
import com.google.android.apps.gsa.search.core.webview.C87267m;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116819jn;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.i */
/* compiled from: PG */
public final class C116510i implements C87267m {

    /* renamed from: a */
    public static final Pattern f323048a = Pattern.compile("\\$INTENT\\$");

    /* renamed from: c */
    private static final AtomicInteger f323049c = new AtomicInteger(0);

    /* renamed from: b */
    public final C116819jn f323050b;

    /* renamed from: d */
    private final Context f323051d;

    /* renamed from: e */
    private final Map f323052e = new HashMap();

    public C116510i(Context context, C116819jn jnVar) {
        this.f323051d = context;
        this.f323050b = jnVar;
    }

    /* renamed from: a */
    public final String mo80904a(String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setInput(new StringReader(str));
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.readFromXml(newPullParser);
            C116509h hVar = new C116509h(this, str2);
            this.f323051d.registerReceiver(hVar, intentFilter);
            String format = String.format(Locale.US, "receiver_%d", new Object[]{Integer.valueOf(f323049c.incrementAndGet())});
            this.f323052e.put(format, hVar);
            return format;
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo80905b() {
        C58976aa aaVar = C58975e.f156826a;
        mo80906c();
    }

    /* renamed from: c */
    public final void mo80906c() {
        C58976aa aaVar = C58975e.f156826a;
        for (Map.Entry value : this.f323052e.entrySet()) {
            this.f323051d.unregisterReceiver((BroadcastReceiver) value.getValue());
        }
        this.f323052e.clear();
    }

    /* renamed from: d */
    public final boolean mo80907d(String str) {
        C58976aa aaVar = C58975e.f156826a;
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) this.f323052e.remove(str);
        if (broadcastReceiver == null) {
            return false;
        }
        this.f323051d.unregisterReceiver(broadcastReceiver);
        return true;
    }
}

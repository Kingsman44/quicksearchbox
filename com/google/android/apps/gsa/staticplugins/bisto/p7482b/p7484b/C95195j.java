package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.regex.Matcher;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.j */
/* compiled from: PG */
final class C95195j implements C95196k {

    /* renamed from: a */
    private int f266335a = 0;

    /* renamed from: b */
    private final String f266336b;

    public C95195j(String str, Matcher matcher) {
        this.f266336b = str;
        try {
            String group = matcher.group(1);
            if (group != null) {
                this.f266335a = Integer.parseInt(group.substring(0, group.length() - 1));
            }
        } catch (NumberFormatException e) {
            C59104x d = C95197l.f266337a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TtsAnnotationUtil");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(14582)).mo56386p("Invalid specifier index");
        } catch (IllegalStateException e2) {
            C59104x c = C95197l.f266337a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TtsAnnotationUtil");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(14583)).mo56386p("Didn't search yet");
        } catch (IndexOutOfBoundsException e3) {
            C59104x c2 = C95197l.f266337a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "TtsAnnotationUtil");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e3)).mo56372aa(14584)).mo56386p("No specifier");
        }
    }

    /* renamed from: a */
    public final int mo89100a() {
        return this.f266335a;
    }

    /* renamed from: b */
    public final boolean mo89101b() {
        return this.f266335a > 0;
    }

    public final String toString() {
        return this.f266336b;
    }
}

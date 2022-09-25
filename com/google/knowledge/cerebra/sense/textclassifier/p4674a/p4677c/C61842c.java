package com.google.knowledge.cerebra.sense.textclassifier.p4674a.p4677c;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58827ar;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.a.c.c */
/* compiled from: PG */
public final class C61842c {
    static {
        Pattern.compile("^[^|]*\\|([^|]*)\\|[^|]*$");
    }

    /* renamed from: a */
    public static String m94491a(int i, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            arrayList.add((String) ((C58833ax) G.next()).mo56106b(C61840a.f167102a).mo56109e(BuildConfig.FLAVOR));
        }
        return String.format(Locale.US, "%s|%s|%d", new Object[]{"androidtc", new C58827ar(";").mo56097d(arrayList), Integer.valueOf(i)});
    }
}

package com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6948b;

import android.app.slice.SliceManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import androidx.slice.C4121t;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88584c;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.p6950d.C88600b;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p7066m.C89995ba;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21452a;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.b.f */
/* compiled from: PG */
public class C88574f implements C89200e {

    /* renamed from: b */
    public static final C59071e f239397b = C59071e.m91332i("com.google.android.apps.gsa.searchbox.c.b.b.f");

    /* renamed from: c */
    protected static final C58528ij f239398c = C58528ij.m90014N("internal.3p:DigitalDocument", "internal.3p:PresentationDigitalDocument", "internal.3p:SpreadsheetDigitalDocument", "internal.3p:TextDigitalDocument", "internal.3p:NoteDigitalDocument");

    /* renamed from: d */
    protected static final C58528ij f239399d = C58528ij.m90012L(84, 89, 156);

    /* renamed from: e */
    protected final String f239400e;

    /* renamed from: f */
    protected final C86124t f239401f;

    /* renamed from: g */
    protected final PackageManager f239402g;

    /* renamed from: h */
    protected final C21370a f239403h;

    /* renamed from: i */
    protected final C68214a f239404i;

    /* renamed from: j */
    protected final C88579k f239405j;

    /* renamed from: k */
    protected final Context f239406k;

    /* renamed from: l */
    protected final Map f239407l = new HashMap();

    /* renamed from: m */
    protected final C68214a f239408m;

    /* renamed from: n */
    protected C88584c f239409n;

    public C88574f(Context context, C86124t tVar, C21370a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f239400e = context.getPackageName();
        this.f239401f = tVar;
        this.f239402g = context.getPackageManager();
        this.f239403h = aVar;
        this.f239404i = aVar2;
        this.f239405j = new C88579k(aVar3, tVar, C89995ba.f246754b);
        this.f239406k = context;
        this.f239408m = aVar4;
    }

    /* renamed from: a */
    protected static String m143124a(String str, int i) {
        return "android.resource://" + str + "/" + i;
    }

    /* renamed from: b */
    protected static String m143125b(String str, String str2) {
        if (TextUtils.isEmpty(str2) || !Character.isDigit(str2.charAt(0))) {
            return str2;
        }
        return "android.resource://" + str + "/" + str2;
    }

    /* renamed from: e */
    protected static Map m143126e(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            try {
                hashMap.put((String) entry.getKey(), Long.valueOf((String) entry.getValue()));
            } catch (NumberFormatException e) {
                C59104x d = f239397b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "IcingResParBase");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(9962)).mo56354G("App %s has invalid blacklist version code %s set", entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    /* renamed from: f */
    protected static boolean m143127f(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("internal.3p:");
    }

    /* renamed from: g */
    protected static boolean m143128g(String str, String str2, boolean z) {
        if ("suggest_query".equals(str2)) {
            return true;
        }
        if (!str.equals("com.google.android.googlequicksearchbox") || !".implicit:".equals(str2) || z) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    protected static boolean m143129h(String str, String str2, boolean z) {
        return str.equals("com.google.android.googlequicksearchbox") && ".implicit:".equals(str2) && z;
    }

    /* renamed from: i */
    protected static boolean m143130i(C86124t tVar, String str, C88577i iVar) {
        return C88600b.m143214b(tVar, str, tVar.mo79745c(C90085ej.f250195bS)) && !TextUtils.isEmpty(C88580l.m143147b(iVar.mo82248a()));
    }

    /* renamed from: j */
    protected static final String m143131j(String str, String str2, String str3, C41679e eVar, boolean z) {
        boolean z2 = !m143128g(str2, str3, z);
        if (!m143129h(str2, str3, z) && z2) {
            return C89235z.m145141m(str, eVar);
        }
        return str.toLowerCase(Locale.US);
    }

    /* renamed from: k */
    protected static String m143132k(String str, C21454b bVar, C88577i iVar) {
        String h = bVar.f59905a.mo117712h("icon");
        if (!TextUtils.isEmpty(h)) {
            return m143125b(str, h);
        }
        if (!m143127f(bVar.f59905a.mo117709e())) {
            return null;
        }
        String a = C88580l.m143146a(iVar);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return m143125b(str, a);
    }

    /* renamed from: l */
    protected static String m143133l(C21454b bVar, C21452a aVar) {
        String h;
        String h2 = bVar.f59905a.mo117712h("intent_data");
        if (h2 == null && aVar != null) {
            h2 = aVar.f59903a.f387467g;
        }
        if (h2 == null || (h = bVar.f59905a.mo117712h("intent_data_id")) == null) {
            return h2;
        }
        String encode = Uri.encode(h);
        return h2 + "/" + encode;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo82245c(String str) {
        Uri uri;
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = BuildConfig.FLAVOR;
        if (isEmpty) {
            return str2;
        }
        if (this.f239407l.containsKey(str)) {
            return (String) this.f239407l.get(str);
        }
        try {
            uri = new C4121t(this.f239406k).f13164b.mapIntentToUri(this.f239406k.getPackageManager().getLaunchIntentForPackage(str));
        } catch (NullPointerException e) {
            C59104x c = f239397b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "IcingResParBase");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(9961)).mo56389s("SliceViewManager could not load slice URI for package %s", str);
            uri = null;
        }
        if (uri != null) {
            str2 = uri.toString();
        }
        this.f239407l.put(str, str2);
        return str2;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f239409n = ((C88614r) obj).f239532c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo82246m(String str, C21454b bVar, String str2, C88577i iVar) {
        if (C89235z.m145124D(str, str2)) {
            String n = C89235z.m145142n(bVar.f59905a.mo117713i(), str);
            C86124t tVar = this.f239401f;
            if (!C88600b.m143213a(tVar, n, tVar.mo79745c(C90085ej.f250194bR))) {
                return false;
            }
            String b = C88580l.m143147b(iVar.mo82248a());
            if (TextUtils.isEmpty(b)) {
                b = mo82245c(n);
            }
            if (TextUtils.isEmpty(b)) {
                return false;
            }
            if (((SliceManager) this.f239406k.getSystemService(SliceManager.class)).checkSlicePermission(Uri.parse(b), Process.myPid(), Process.myUid()) != 0) {
                C59104x c = f239397b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "IcingResParBase");
                ((C59052c) ((C59052c) c).mo56372aa(9963)).mo56389s("Missing slice permission for URI %s", b);
                return false;
            } else if (!TextUtils.isEmpty(b)) {
                return true;
            }
        }
        return false;
    }
}

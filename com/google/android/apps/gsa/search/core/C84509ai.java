package com.google.android.apps.gsa.search.core;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85848af;
import com.google.android.apps.gsa.search.core.google.C85849ag;
import com.google.android.apps.gsa.search.core.p6805i.C86129y;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.C91087s;
import com.google.android.apps.gsa.shared.util.C91089t;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.io.File;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.ai */
/* compiled from: PG */
public final class C84509ai implements C91087s, C86129y {

    /* renamed from: a */
    private static final C59071e f229991a = C59071e.m91332i("com.google.android.apps.gsa.search.core.ai");

    /* renamed from: b */
    private static final Uri f229992b = Uri.parse("content://com.google.android.voicesearch/prefs");

    /* renamed from: c */
    private final Context f229993c;

    /* renamed from: d */
    private final C68214a f229994d;

    /* renamed from: e */
    private C86338r f229995e;

    /* renamed from: f */
    private C86338r f229996f;

    /* renamed from: g */
    private String f229997g;

    /* renamed from: h */
    private int f229998h;

    /* renamed from: i */
    private C86337q f229999i;

    /* renamed from: j */
    private C86337q f230000j;

    public C84509ai(Context context, C68214a aVar) {
        this.f229993c = context;
        this.f229994d = aVar;
    }

    /* renamed from: d */
    static boolean m135133d(String str) {
        return str.equals(C90507o.f253027q) || str.startsWith(C90507o.f253022l) || str.startsWith(C90507o.f253031u) || str.startsWith(C90507o.f253026p);
    }

    /* renamed from: f */
    private final Map m135134f(String str) {
        File file = new File(new File(this.f229993c.getApplicationInfo().dataDir, "shared_prefs"), str.concat(".xml"));
        File file2 = new File(String.valueOf(file.getPath()).concat(".bak"));
        if (file2.exists()) {
            file.delete();
            file = file2;
        }
        if (!file.exists()) {
            return null;
        }
        try {
            return this.f229993c.getSharedPreferences(str, 0).getAll();
        } finally {
            file.delete();
        }
    }

    /* renamed from: g */
    private static void m135135g(Map map, C84493ah ahVar) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            C86337q a = ahVar.mo78024a(str);
            if (a != null) {
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    a.mo80067b(str, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    a.mo80070e(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    a.mo80072g(str, ((Long) value).longValue());
                } else if (value instanceof String) {
                    a.mo80073h(str, (String) value);
                } else if (value instanceof Set) {
                    a.mo80074i(str, (Set) value);
                } else if (value instanceof Float) {
                    a.mo80069d(str, ((Float) value).floatValue());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo70787a(Cursor cursor) {
        String string = cursor.getString(0);
        String string2 = cursor.getString(1);
        if ("profanityFilter".equals(string)) {
            ((C86341u) mo78213b()).mo80085k(string, Boolean.valueOf(Boolean.parseBoolean(string2)));
        } else if ("actual_language_setting".equals(string)) {
            mo78213b().mo80073h("spoken-language-bcp-47", string2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C86337q mo78213b() {
        if (this.f230000j == null) {
            this.f230000j = new C86341u((C86346z) this.f229996f);
        }
        return this.f230000j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C86337q mo78214c() {
        C86337q qVar = this.f229999i;
        qVar.getClass();
        return qVar;
    }

    /* renamed from: e */
    public final void mo78215e(C86338r rVar, C86338r rVar2, int i, int i2) {
        Map f;
        Map f2;
        int intValue;
        this.f229995e = rVar;
        this.f229996f = rVar2;
        this.f229997g = "settings_version";
        this.f229998h = i2;
        C90476a aVar = C91018d.f254254a;
        this.f229995e.mo80078d();
        this.f229996f.mo80078d();
        try {
            C86341u uVar = new C86341u((C86346z) this.f229995e);
            this.f229999i = uVar;
            if (i <= 0 && (f2 = m135134f("StartupSettings")) != null) {
                Object obj = f2.get(this.f229997g);
                if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue()) > 0 && intValue <= 2) {
                    m135135g(f2, new C84468ag(uVar));
                    i = intValue;
                }
            }
            if (i <= 0) {
                if (this.f229996f.getBoolean("settings_upgraded", false)) {
                    mo78213b().mo80075j("settings_upgraded");
                } else {
                    C91089t.m148814c(this, this.f229993c.getContentResolver().query(f229992b, (String[]) null, (String) null, (String[]) null, (String) null));
                }
                Map f3 = m135134f("AlarmUtils");
                if (f3 != null) {
                    for (Map.Entry entry : f3.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (str.endsWith("_StartTimeMillis") && (value instanceof Long)) {
                            String concat = "AlarmStartTimeMillis_".concat(String.valueOf(str.substring(0, str.length() - 16)));
                            ((C86341u) mo78213b()).mo80085k(concat, Long.valueOf(((Long) value).longValue()));
                        }
                    }
                }
                Map f4 = m135134f("PredictiveCardsOptInSettings");
                if (f4 != null) {
                    m135135g(f4, new C84465af(this, f4));
                }
                Map f5 = m135134f("com.google.android.googlequicksearchbox_preferences");
                if (f5 != null) {
                    m135135g(f5, new C84465af(this, f5));
                }
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f229991a.mo56225c()).mo56382g(e)).mo56372aa(7405)).mo56386p("Error during voice search settings upgrade.");
        } catch (Throwable th) {
            this.f229995e.mo80077c();
            this.f229996f.mo80077c();
            throw th;
        }
        if (i < 2) {
            try {
                mo78213b().mo80073h("gservices_overrides", C85849ag.m137936b((C85848af) this.f229994d.mo27525b(), this.f229998h));
            } catch (SecurityException e2) {
                ((C59052c) ((C59052c) ((C59052c) f229991a.mo56225c()).mo56382g(e2)).mo56372aa(7404)).mo56386p("Unable to update GSERVICES_OVERRIDES");
            }
        }
        if (i < 3 && (f = m135134f("SearchSettings")) != null) {
            m135135g(f, new C84465af(this, f));
        }
        C86337q qVar = this.f229999i;
        if (qVar != null) {
            ((C86341u) qVar).mo80086l(false);
        }
        C86337q qVar2 = this.f230000j;
        if (qVar2 != null) {
            ((C86341u) qVar2).mo80086l(false);
        }
        if (i < 8) {
            ((C86341u) mo78213b()).mo80085k("need_source_stats_upgrade", true);
        }
        if (i < 10) {
            boolean contains = this.f229996f.contains("safe_search");
            if ("active".equals(this.f229996f.getString("safe_search_settings", "images")) && !contains) {
                ((C86341u) mo78213b()).mo80085k("safe_search", true);
            }
            mo78213b().mo80075j("safe_search_settings");
            if (this.f229996f.getBoolean("safe_search_bimodal", false) && !contains) {
                ((C86341u) mo78213b()).mo80085k("safe_search", true);
            }
            mo78213b().mo80075j("safe_search_bimodal");
        }
        if (i < 11) {
            int i3 = this.f229995e.getInt(C90507o.f253027q, -1);
            mo78214c().mo80075j(C90507o.f253027q);
            String string = this.f229995e.getString(C90507o.f253011a, (String) null);
            if (string != null) {
                ((C86341u) mo78214c()).mo80085k(C90507o.f253027q.concat(string), Integer.valueOf(i3));
            }
        }
        if (i < 13) {
            mo78213b().mo80075j("blob_feature_map");
        }
        if (i < 14) {
            if (this.f229996f.contains("enable_corpus_com.google.android.googlequicksearchbox/applications_uri")) {
                boolean z = this.f229996f.getBoolean("enable_corpus_com.google.android.googlequicksearchbox/applications_uri", true);
                ((C86341u) mo78213b()).mo80085k("enable_corpus_com.google.android.gms/apps", Boolean.valueOf(z));
            }
        }
        if (i < 15 && this.f229996f.contains("enable_corpus_com.google.android.googlequicksearchbox/contacts_contact_id")) {
            boolean z2 = this.f229996f.getBoolean("enable_corpus_com.google.android.googlequicksearchbox/contacts_contact_id", true);
            ((C86341u) mo78213b()).mo80085k("enable_corpus_com.google.android.gms/contacts_contact_id", Boolean.valueOf(z2));
        }
        if (i < 16) {
            C86337q b = mo78213b();
            b.mo80075j("app_launch_log_migration_needed");
            b.mo80075j("background_task_earliest_next_run_log_contacts_to_clearcut_incrementally");
            b.mo80075j("background_task_earliest_next_run_log_contacts_to_clearcut_unconditionally");
            b.mo80075j("background_task_earliest_next_run_update_icing_corpora");
            b.mo80075j("background_task_forced_run_log_contacts_to_clearcut_incrementally");
            b.mo80075j("background_task_forced_run_log_contacts_to_clearcut_unconditionally");
            b.mo80075j("background_task_forced_run_update_icing_corpora");
            b.mo80075j("ContactLoggerTimestamp");
            b.mo80075j("ContactLoggerHash");
            b.mo80075j("contact_logger_incremental_upload_timestamp");
            b.mo80075j("contact_logger_pending_significant_update");
            b.mo80075j("KEY_LAST_APPLICATIONS_UPDATE");
            b.mo80075j("KEY_LAST_CONTACTS_UPDATE");
            b.mo80075j("key_last_contacts_delta_update_timestamp");
            b.mo80075j("key_last_contacts_delta_delete_timestamp");
        }
        if (i < 17) {
            C86337q b2 = mo78213b();
            b2.mo80075j("background_task_forced_run_delete_local_search_history");
            b2.mo80075j("background_task_earliest_next_run_delete_local_search_history");
        }
        if (i < 18) {
            C86337q b3 = mo78213b();
            b3.mo80075j("background_task_earliest_next_run_cleanup_extradex_registry");
            b3.mo80075j("background_task_forced_run_cleanup_extradex_registry");
        }
        if (i < 19 && this.f229996f.contains("enable_corpus_com.google.android.gms/apps")) {
            boolean z3 = this.f229996f.getBoolean("enable_corpus_com.google.android.gms/apps", true);
            ((C86341u) mo78213b()).mo80085k("enable_corpus_com.google.android.gms/internal.3p:MobileApplication", Boolean.valueOf(z3));
        }
        if (i < 20) {
            mo78213b().mo80075j("newest_committed_gsa_configs");
        }
        ((C86341u) mo78214c()).mo80085k(this.f229997g, 20);
        ((C86341u) mo78214c()).mo80086l(false);
        this.f229999i = null;
        C86337q qVar3 = this.f230000j;
        if (qVar3 != null) {
            ((C86341u) qVar3).mo80086l(false);
            this.f230000j = null;
        }
        this.f229995e.mo80077c();
        this.f229996f.mo80077c();
    }
}

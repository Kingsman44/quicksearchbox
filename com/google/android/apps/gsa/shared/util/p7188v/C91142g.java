package com.google.android.apps.gsa.shared.util.p7188v;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90128g;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.util.v.g */
/* compiled from: PG */
public class C91142g {

    /* renamed from: a */
    public static final C59071e f254468a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.v.g");

    /* renamed from: b */
    public static final C58485gu f254469b = C58485gu.m89834D("GSAPrefs.customtabs_no_session_in_now", "GSAPrefs.Bisto__enable_bisto_feature", "GEL.GSAPrefs.now_opted_in_version", "GSAPrefs.last_optin_error_time", "GSAPrefs.first_run_screens_shown", "GSAPrefs.show_first_run_optin", "GSAPrefs.show_express_optin", "GSAPrefs.np_stream_allowed", C90507o.f253030t, "GSAPrefs.search_gesture_used", "GEL.GSAPrefs.can_optin_to_now", "GEL.GSAPrefs.is_trying_to_optin_to_now", "GSAPrefs.should_show_now_cards", "GsaPrefs.Bisto__apollo_ota_minimum_system_version", "GsaPrefs.Bisto__apollo_ota_system_url", "GsaPrefs.Bisto__apollo_ota_system_version", "GsaPrefs.Bisto__apollo_configurable_double_tap", "GsaPrefs.Bisto__baywolf_ota_system_url", "GsaPrefs.Bisto__baywolf_ota_system_version", "GsaPrefs.Bisto__scout_ota_system_url", "GsaPrefs.Bisto__scout_ota_system_version", "GsaPrefs.Bisto__bisto_hotwording", "GsaPrefs.Bisto__first_stage_hotwording", "GsaPrefs.bisto_query_migrate_to_session", "GsaPrefs.splash_animation_times_to_show", "GsaPrefs.Bisto__notification_fetch_clientop", "GsaPrefs.Bisto__enable_hotword_helper_speaker_id_nullness_checker", "GsaPrefs.Bisto__enable_audio_cache", "GSAPrefs.Bisto__service_shutdown_delay_ms", "GsaPrefs.Bisto__hotword_activation_timeout_ms", "GSAPrefs.TNG_MINUS_ONE_ENABLED", "GSAPrefs.TNG_ACETONE_ENABLED", "GSAPrefs.TNG_HOMESCREEN_ENABLED");

    /* renamed from: c */
    protected final Context f254470c;

    /* renamed from: d */
    private SharedPreferences f254471d;

    public C91142g(Context context) {
        this.f254470c = context;
    }

    /* renamed from: b */
    public void mo78242b() {
        C90476a aVar = C91018d.f254254a;
        this.f254470c.getSharedPreferences("GEL.GSAPrefs", 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return (long) r0.getInt(r3, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0.contains(r3) != false) goto L_0x0013;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000d */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo85398c(java.lang.String r3, long r4) {
        /*
            r2 = this;
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            android.content.SharedPreferences r0 = r2.mo85400e()
            long r3 = r0.getLong(r3, r4)     // Catch:{ ClassCastException -> 0x000d }
            return r3
        L_0x000b:
            r3 = move-exception
            goto L_0x001b
        L_0x000d:
            boolean r1 = r0.contains(r3)     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x001a
            r4 = -1
            int r3 = r0.getInt(r3, r4)     // Catch:{ all -> 0x000b }
            long r3 = (long) r3
            return r3
        L_0x001a:
            return r4
        L_0x001b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.p7188v.C91142g.mo85398c(java.lang.String, long):long");
    }

    /* renamed from: d */
    public final long mo85399d(C90102f fVar) {
        int i = fVar.f250556a;
        return mo85398c("flag." + i, fVar.f250557b);
    }

    /* renamed from: e */
    public final synchronized SharedPreferences mo85400e() {
        if (this.f254471d == null) {
            this.f254471d = this.f254470c.getSharedPreferences("GEL.GSAPrefs", 0);
        }
        return this.f254471d;
    }

    /* renamed from: f */
    public final C63088z mo85401f(C90128g gVar) {
        int i = gVar.f251801a;
        String g = mo85402g("flag." + i, (String) null);
        if (g != null) {
            try {
                return C63088z.m96139A(Base64.decode(g, 2));
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f254468a.mo56225c()).mo56382g(e)).mo56372aa(11453)).mo56387q("Invalid byte flag: %d", gVar.f251801a);
            }
        }
        return C63088z.f170246b;
    }

    /* renamed from: g */
    public final String mo85402g(String str, String str2) {
        C90476a aVar = C91018d.f254254a;
        return mo85400e().getString(str, str2);
    }

    /* renamed from: h */
    public final String mo85403h(C90129h hVar) {
        int i = hVar.f251802a;
        return mo85402g("flag." + i, hVar.f251803b);
    }

    /* renamed from: i */
    public final boolean mo85404i(String str) {
        C90476a aVar = C91018d.f254254a;
        return mo85400e().contains(str);
    }

    /* renamed from: j */
    public final boolean mo85405j(C90048d dVar) {
        int i = dVar.f248757a;
        return mo85406k("flag." + i, dVar.f248758b);
    }

    /* renamed from: k */
    public final boolean mo85406k(String str, boolean z) {
        C90476a aVar = C91018d.f254254a;
        return mo85400e().getBoolean(str, z);
    }

    /* renamed from: l */
    public final Set mo85407l() {
        C90476a aVar = C91018d.f254254a;
        return mo85400e().getStringSet("GSAPrefs.whitelisted_google_account_names", (Set) null);
    }
}

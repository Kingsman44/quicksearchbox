package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import com.google.android.gms.measurement.p10848a.C145126ad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68919m;

/* renamed from: com.google.android.gms.measurement.internal.ah */
/* compiled from: PG */
final class C145228ah extends C145478jo {

    /* renamed from: a */
    public static final String[] f392569a = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: b */
    public static final String[] f392570b = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: c */
    public static final String[] f392571c = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};

    /* renamed from: d */
    public static final String[] f392572d = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: e */
    public static final String[] f392573e = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: f */
    public static final String[] f392574f = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: g */
    public static final String[] f392575g = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: h */
    public static final String[] f392576h = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: i */
    public final C145474jk f392577i = new C145474jk();

    /* renamed from: j */
    private final C145227ag f392578j;

    public C145228ah(C145488jy jyVar) {
        super(jyVar);
        C145361ff ffVar = this.f393011w;
        C144006f fVar = ffVar.f392924A;
        C145222ab abVar = ffVar.f392937g;
        this.f392578j = new C145227ag(this, ffVar.f392931a);
    }

    /* renamed from: H */
    static final void m235930H(ContentValues contentValues, Object obj) {
        C143919bh.m233969l("value");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: A */
    public final boolean mo120796A(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        mo120904g();
        mo121194J();
        String str = conditionalUserPropertyParcel.f392524a;
        C143919bh.m233958a(str);
        if (mo120812k(str, conditionalUserPropertyParcel.f392526c.f392541b) == null) {
            long a = mo120803a("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            C145222ab abVar = this.f393011w.f392937g;
            if (a >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", conditionalUserPropertyParcel.f392525b);
        contentValues.put("name", conditionalUserPropertyParcel.f392526c.f392541b);
        Object a2 = conditionalUserPropertyParcel.f392526c.mo120761a();
        C143919bh.m233958a(a2);
        m235930H(contentValues, a2);
        contentValues.put("active", Boolean.valueOf(conditionalUserPropertyParcel.f392528e));
        contentValues.put("trigger_event_name", conditionalUserPropertyParcel.f392529f);
        contentValues.put("trigger_timeout", Long.valueOf(conditionalUserPropertyParcel.f392531h));
        contentValues.put("timed_out_event", this.f393011w.mo120977o().mo121275ah(conditionalUserPropertyParcel.f392530g));
        contentValues.put("creation_timestamp", Long.valueOf(conditionalUserPropertyParcel.f392527d));
        contentValues.put("triggered_event", this.f393011w.mo120977o().mo121275ah(conditionalUserPropertyParcel.f392532i));
        contentValues.put("triggered_timestamp", Long.valueOf(conditionalUserPropertyParcel.f392526c.f392542c));
        contentValues.put("time_to_live", Long.valueOf(conditionalUserPropertyParcel.f392533j));
        contentValues.put("expired_event", this.f393011w.mo120977o().mo121275ah(conditionalUserPropertyParcel.f392534k));
        try {
            if (mo120806d().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.f393011w.mo120965ar().f392795c.mo120895b("Failed to insert/update conditional user property (got -1)", C145325dx.m236116a(str));
            }
        } catch (SQLiteException e) {
            this.f393011w.mo120965ar().f392795c.mo120896c("Error storing conditional user property", C145325dx.m236116a(str), e);
        }
        return true;
    }

    /* renamed from: B */
    public final boolean mo120797B(C145493kc kcVar) {
        mo120904g();
        mo121194J();
        if (mo120812k(kcVar.f393381a, kcVar.f393383c) == null) {
            if (C145495ke.m236486ae(kcVar.f393383c)) {
                if (mo120803a("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{kcVar.f393381a}) >= ((long) this.f393011w.f392937g.mo120769e(kcVar.f393381a, C145313dl.f392699F, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(kcVar.f393383c)) {
                long a = mo120803a("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{kcVar.f393381a, kcVar.f393382b});
                C145222ab abVar = this.f393011w.f392937g;
                if (a >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", kcVar.f393381a);
        contentValues.put("origin", kcVar.f393382b);
        contentValues.put("name", kcVar.f393383c);
        contentValues.put("set_timestamp", Long.valueOf(kcVar.f393384d));
        m235930H(contentValues, kcVar.f393385e);
        try {
            if (mo120806d().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.f393011w.mo120965ar().f392795c.mo120895b("Failed to insert/update user property (got -1). appId", C145325dx.m236116a(kcVar.f393381a));
            }
        } catch (SQLiteException e) {
            this.f393011w.mo120965ar().f392795c.mo120896c("Error storing user property. appId", C145325dx.m236116a(kcVar.f393381a), e);
        }
        return true;
    }

    /* renamed from: C */
    public final C145226af mo120798C(long j, String str, boolean z, boolean z2) {
        return mo120810i(j, str, 1, false, false, z, false, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        if (r2 > (com.google.android.gms.measurement.internal.C145222ab.m235900s() + r0)) goto L_0x0044;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120799D(com.google.android.gms.measurement.p10848a.C145134al r8, boolean r9) {
        /*
            r7 = this;
            r7.mo120904g()
            r7.mo121194J()
            com.google.android.gms.common.internal.C143919bh.m233958a(r8)
            java.lang.String r0 = r8.f392272q
            com.google.android.gms.common.internal.C143919bh.m233969l(r0)
            int r0 = r8.f392256a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            com.google.android.gms.common.internal.C143919bh.m233966i(r0)
            r7.mo120822u()
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.common.util.f r0 = r0.f392924A
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r8.f392263h
            com.google.android.gms.measurement.internal.ff r4 = r7.f393011w
            com.google.android.gms.measurement.internal.ab r4 = r4.f392937g
            long r4 = com.google.android.gms.measurement.internal.C145222ab.m235900s()
            long r4 = r0 - r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0044
            long r2 = r8.f392263h
            com.google.android.gms.measurement.internal.ff r4 = r7.f393011w
            com.google.android.gms.measurement.internal.ab r4 = r4.f392937g
            long r4 = com.google.android.gms.measurement.internal.C145222ab.m235900s()
            long r4 = r4 + r0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0061
        L_0x0044:
            com.google.android.gms.measurement.internal.ff r2 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392798f
            java.lang.String r3 = r8.f392272q
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r4 = r8.f392263h
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            r2.mo120897d(r4, r3, r0, r1)
        L_0x0061:
            byte[] r0 = r8.toByteArray()
            com.google.android.gms.measurement.internal.jy r1 = r7.f393327l     // Catch:{ IOException -> 0x00f2 }
            com.google.android.gms.measurement.internal.ka r1 = r1.f393359g     // Catch:{ IOException -> 0x00f2 }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r1)     // Catch:{ IOException -> 0x00f2 }
            byte[] r0 = r1.mo121245w(r0)     // Catch:{ IOException -> 0x00f2 }
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392803k
            int r2 = r0.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Saving bundle, size"
            r1.mo120895b(r3, r2)
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = "app_id"
            java.lang.String r3 = r8.f392272q
            r1.put(r2, r3)
            long r2 = r8.f392263h
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "bundle_end_timestamp"
            r1.put(r3, r2)
            java.lang.String r2 = "data"
            r1.put(r2, r0)
            java.lang.String r0 = "has_realtime"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1.put(r0, r9)
            int r9 = r8.f392257b
            r9 = r9 & 2
            if (r9 == 0) goto L_0x00b8
            int r9 = r8.f392246I
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "retry_count"
            r1.put(r0, r9)
        L_0x00b8:
            android.database.sqlite.SQLiteDatabase r9 = r7.mo120806d()     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r0 = "queue"
            r2 = 0
            long r0 = r9.insert(r0, r2, r1)     // Catch:{ SQLiteException -> 0x00dd }
            r2 = -1
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.ff r9 = r7.f393011w     // Catch:{ SQLiteException -> 0x00dd }
            com.google.android.gms.measurement.internal.dx r9 = r9.mo120965ar()     // Catch:{ SQLiteException -> 0x00dd }
            com.google.android.gms.measurement.internal.dv r9 = r9.f392795c     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r0 = "Failed to insert bundle (got -1). appId"
            java.lang.String r1 = r8.f392272q     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r1)     // Catch:{ SQLiteException -> 0x00dd }
            r9.mo120895b(r0, r1)     // Catch:{ SQLiteException -> 0x00dd }
        L_0x00dc:
            return
        L_0x00dd:
            r9 = move-exception
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c
            java.lang.String r8 = r8.f392272q
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r8)
            java.lang.String r1 = "Error storing bundle. appId"
            r0.mo120896c(r1, r8, r9)
            return
        L_0x00f2:
            r9 = move-exception
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c
            java.lang.String r8 = r8.f392272q
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r8)
            java.lang.String r1 = "Data loss. Failed to serialize bundle. appId"
            r0.mo120896c(r1, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145228ah.mo120799D(com.google.android.gms.measurement.a.al, boolean):void");
    }

    /* renamed from: E */
    public final void mo120800E(String str, String str2) {
        C143919bh.m233969l(str);
        C143919bh.m233969l(str2);
        mo120904g();
        mo121194J();
        try {
            mo120806d().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f393011w.mo120965ar().f392795c.mo120897d("Error deleting conditional property", C145325dx.m236116a(str), this.f393011w.f392942l.mo120892e(str2), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x0090=Splitter:B:36:0x0090, B:13:0x0041=Splitter:B:13:0x0041} */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120801F(long r22, long r24, com.google.android.gms.measurement.internal.C145486jw r26) {
        /*
            r21 = this;
            r1 = r21
            r2 = r26
            java.lang.String r0 = "select app_id, metadata_fingerprint from raw_events where "
            java.lang.String r3 = "select metadata_fingerprint from raw_events where app_id = ?"
            r21.mo120904g()
            r21.mo121194J()
            r4 = 0
            android.database.sqlite.SQLiteDatabase r14 = r21.mo120806d()     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            java.lang.String r6 = ""
            r15 = -1
            r13 = 2
            r12 = 1
            r11 = 0
            if (r5 == 0) goto L_0x0077
            int r3 = (r24 > r15 ? 1 : (r24 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x0033
            java.lang.String[] r3 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            java.lang.String r5 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            r3[r11] = r5     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            java.lang.String r5 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            r3[r12] = r5     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            goto L_0x003b
        L_0x0033:
            java.lang.String[] r3 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            java.lang.String r5 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            r3[r11] = r5     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
        L_0x003b:
            int r5 = (r24 > r15 ? 1 : (r24 == r15 ? 0 : -1))
            if (r5 == 0) goto L_0x0041
            java.lang.String r6 = "rowid <= ? and "
        L_0x0041:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            r5.<init>(r0)     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            r5.append(r6)     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            java.lang.String r0 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r5.append(r0)     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            java.lang.String r0 = r5.toString()     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            android.database.Cursor r3 = r14.rawQuery(r0, r3)     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r0 != 0) goto L_0x0062
            if (r3 == 0) goto L_0x0061
            r3.close()
        L_0x0061:
            return
        L_0x0062:
            java.lang.String r5 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r0 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x0070 }
            r3.close()     // Catch:{ SQLiteException -> 0x0070 }
            r17 = r5
            goto L_0x00ba
        L_0x0070:
            r0 = move-exception
            r4 = r5
            goto L_0x02b0
        L_0x0074:
            r0 = move-exception
            goto L_0x02b0
        L_0x0077:
            int r0 = (r24 > r15 ? 1 : (r24 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0086
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            r0[r11] = r4     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            java.lang.String r5 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            r0[r12] = r5     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            goto L_0x008a
        L_0x0086:
            java.lang.String[] r0 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            r0[r11] = r4     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
        L_0x008a:
            int r5 = (r24 > r15 ? 1 : (r24 == r15 ? 0 : -1))
            if (r5 == 0) goto L_0x0090
            java.lang.String r6 = " and rowid <= ?"
        L_0x0090:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            r5.<init>(r3)     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            r5.append(r6)     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            java.lang.String r3 = " order by rowid limit 1;"
            r5.append(r3)     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            java.lang.String r3 = r5.toString()     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            android.database.Cursor r3 = r14.rawQuery(r3, r0)     // Catch:{ SQLiteException -> 0x02ac, all -> 0x02a8 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x02a4 }
            if (r0 != 0) goto L_0x00b1
            if (r3 == 0) goto L_0x00b0
            r3.close()
        L_0x00b0:
            return
        L_0x00b1:
            java.lang.String r0 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x02a4 }
            r3.close()     // Catch:{ SQLiteException -> 0x02a4 }
            r17 = r4
        L_0x00ba:
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r5 = "metadata"
            r7[r11] = r5     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String[] r9 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x02a0 }
            r9[r11] = r17     // Catch:{ SQLiteException -> 0x02a0 }
            r9[r12] = r0     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r6 = "raw_events_metadata"
            java.lang.String r8 = "app_id = ? and metadata_fingerprint = ?"
            r10 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "2"
            r5 = r14
            r4 = 0
            r11 = r18
            r12 = r19
            r13 = r20
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x02a0 }
            boolean r5 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x02a0 }
            if (r5 != 0) goto L_0x00fa
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r17)     // Catch:{ SQLiteException -> 0x02a0 }
            r0.mo120895b(r2, r4)     // Catch:{ SQLiteException -> 0x02a0 }
            if (r3 == 0) goto L_0x00f9
            r3.close()
        L_0x00f9:
            return
        L_0x00fa:
            byte[] r5 = r3.getBlob(r4)     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.a.al r6 = com.google.android.gms.measurement.p10848a.C145134al.f392236S     // Catch:{ IOException -> 0x0288 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ IOException -> 0x0288 }
            com.google.android.gms.measurement.a.ak r6 = (com.google.android.gms.measurement.p10848a.C145133ak) r6     // Catch:{ IOException -> 0x0288 }
            com.google.protobuf.ds r5 = com.google.android.gms.measurement.internal.C145491ka.m236458k(r6, r5)     // Catch:{ IOException -> 0x0288 }
            com.google.android.gms.measurement.a.ak r5 = (com.google.android.gms.measurement.p10848a.C145133ak) r5     // Catch:{ IOException -> 0x0288 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ IOException -> 0x0288 }
            com.google.android.gms.measurement.a.al r5 = (com.google.android.gms.measurement.p10848a.C145134al) r5     // Catch:{ IOException -> 0x0288 }
            boolean r6 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x02a0 }
            if (r6 == 0) goto L_0x0129
            com.google.android.gms.measurement.internal.ff r6 = r1.f393011w     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.internal.dx r6 = r6.mo120965ar()     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.internal.dv r6 = r6.f392798f     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r7 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r17)     // Catch:{ SQLiteException -> 0x02a0 }
            r6.mo120895b(r7, r8)     // Catch:{ SQLiteException -> 0x02a0 }
        L_0x0129:
            r3.close()     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r5)     // Catch:{ SQLiteException -> 0x02a0 }
            r2.f393339a = r5     // Catch:{ SQLiteException -> 0x02a0 }
            r13 = 3
            int r5 = (r24 > r15 ? 1 : (r24 == r15 ? 0 : -1))
            if (r5 == 0) goto L_0x0147
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x02a0 }
            r6[r4] = r17     // Catch:{ SQLiteException -> 0x02a0 }
            r15 = 1
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r0 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x02a0 }
            r12 = 2
            r6[r12] = r0     // Catch:{ SQLiteException -> 0x02a0 }
            goto L_0x0151
        L_0x0147:
            r12 = 2
            r15 = 1
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x02a0 }
            r6[r4] = r17     // Catch:{ SQLiteException -> 0x02a0 }
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02a0 }
        L_0x0151:
            r8 = r5
            r9 = r6
            r0 = 4
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r0 = "rowid"
            r7[r4] = r0     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r0 = "name"
            r7[r15] = r0     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r0 = "timestamp"
            r7[r12] = r0     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r0 = "data"
            r7[r13] = r0     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r6 = "raw_events"
            r10 = 0
            r11 = 0
            java.lang.String r0 = "rowid"
            r16 = 0
            r5 = r14
            r14 = 2
            r12 = r0
            r14 = 3
            r13 = r16
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x02a0 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x02a0 }
            if (r0 == 0) goto L_0x0271
        L_0x017e:
            long r5 = r3.getLong(r4)     // Catch:{ SQLiteException -> 0x02a0 }
            byte[] r0 = r3.getBlob(r14)     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.a.ad r7 = com.google.android.gms.measurement.p10848a.C145126ad.f392211g     // Catch:{ IOException -> 0x0251 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ IOException -> 0x0251 }
            com.google.android.gms.measurement.a.ac r7 = (com.google.android.gms.measurement.p10848a.C145125ac) r7     // Catch:{ IOException -> 0x0251 }
            com.google.protobuf.ds r0 = com.google.android.gms.measurement.internal.C145491ka.m236458k(r7, r0)     // Catch:{ IOException -> 0x0251 }
            com.google.android.gms.measurement.a.ac r0 = (com.google.android.gms.measurement.p10848a.C145125ac) r0     // Catch:{ IOException -> 0x0251 }
            java.lang.String r7 = r3.getString(r15)     // Catch:{ SQLiteException -> 0x02a0 }
            r0.copyOnWrite()     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.protobuf.bv r8 = r0.instance     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.a.ad r8 = (com.google.android.gms.measurement.p10848a.C145126ad) r8     // Catch:{ SQLiteException -> 0x02a0 }
            r7.getClass()     // Catch:{ SQLiteException -> 0x02a0 }
            int r9 = r8.f392213a     // Catch:{ SQLiteException -> 0x02a0 }
            r9 = r9 | r15
            r8.f392213a = r9     // Catch:{ SQLiteException -> 0x02a0 }
            r8.f392215c = r7     // Catch:{ SQLiteException -> 0x02a0 }
            r7 = 2
            long r8 = r3.getLong(r7)     // Catch:{ SQLiteException -> 0x02a0 }
            r0.copyOnWrite()     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.protobuf.bv r7 = r0.instance     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.a.ad r7 = (com.google.android.gms.measurement.p10848a.C145126ad) r7     // Catch:{ SQLiteException -> 0x02a0 }
            int r10 = r7.f392213a     // Catch:{ SQLiteException -> 0x02a0 }
            r11 = 2
            r10 = r10 | r11
            r7.f392213a = r10     // Catch:{ SQLiteException -> 0x02a0 }
            r7.f392216d = r8     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.a.ad r0 = (com.google.android.gms.measurement.p10848a.C145126ad) r0     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r0)     // Catch:{ SQLiteException -> 0x02a0 }
            java.util.List r7 = r2.f393341c     // Catch:{ SQLiteException -> 0x02a0 }
            if (r7 != 0) goto L_0x01d1
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02a0 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02a0 }
            r2.f393341c = r7     // Catch:{ SQLiteException -> 0x02a0 }
        L_0x01d1:
            java.util.List r7 = r2.f393340b     // Catch:{ SQLiteException -> 0x02a0 }
            if (r7 != 0) goto L_0x01dc
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02a0 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02a0 }
            r2.f393340b = r7     // Catch:{ SQLiteException -> 0x02a0 }
        L_0x01dc:
            java.util.List r7 = r2.f393341c     // Catch:{ SQLiteException -> 0x02a0 }
            boolean r7 = r7.isEmpty()     // Catch:{ SQLiteException -> 0x02a0 }
            if (r7 != 0) goto L_0x01f9
            java.util.List r7 = r2.f393341c     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.a.ad r7 = (com.google.android.gms.measurement.p10848a.C145126ad) r7     // Catch:{ SQLiteException -> 0x02a0 }
            long r7 = com.google.android.gms.measurement.internal.C145486jw.m236408a(r7)     // Catch:{ SQLiteException -> 0x02a0 }
            long r9 = com.google.android.gms.measurement.internal.C145486jw.m236408a(r0)     // Catch:{ SQLiteException -> 0x02a0 }
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x01f9
            goto L_0x024b
        L_0x01f9:
            long r7 = r2.f393342d     // Catch:{ SQLiteException -> 0x02a0 }
            int r9 = r0.getSerializedSize()     // Catch:{ SQLiteException -> 0x02a0 }
            long r9 = (long) r9     // Catch:{ SQLiteException -> 0x02a0 }
            long r7 = r7 + r9
            com.google.android.gms.measurement.internal.jy r9 = r2.f393343e     // Catch:{ SQLiteException -> 0x02a0 }
            r9.mo121211d()     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.internal.dk r9 = com.google.android.gms.measurement.internal.C145313dl.f392743i     // Catch:{ SQLiteException -> 0x02a0 }
            r10 = 0
            java.lang.Object r9 = r9.mo120854a(r10)     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ SQLiteException -> 0x02a0 }
            int r9 = r9.intValue()     // Catch:{ SQLiteException -> 0x02a0 }
            int r9 = java.lang.Math.max(r4, r9)     // Catch:{ SQLiteException -> 0x02a0 }
            long r9 = (long) r9     // Catch:{ SQLiteException -> 0x02a0 }
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 >= 0) goto L_0x024b
            r2.f393342d = r7     // Catch:{ SQLiteException -> 0x02a0 }
            java.util.List r7 = r2.f393341c     // Catch:{ SQLiteException -> 0x02a0 }
            r7.add(r0)     // Catch:{ SQLiteException -> 0x02a0 }
            java.util.List r0 = r2.f393340b     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x02a0 }
            r0.add(r5)     // Catch:{ SQLiteException -> 0x02a0 }
            java.util.List r0 = r2.f393341c     // Catch:{ SQLiteException -> 0x02a0 }
            int r0 = r0.size()     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.internal.jy r5 = r2.f393343e     // Catch:{ SQLiteException -> 0x02a0 }
            r5.mo121211d()     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.internal.dk r5 = com.google.android.gms.measurement.internal.C145313dl.f392744j     // Catch:{ SQLiteException -> 0x02a0 }
            r6 = 0
            java.lang.Object r5 = r5.mo120854a(r6)     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ SQLiteException -> 0x02a0 }
            int r5 = r5.intValue()     // Catch:{ SQLiteException -> 0x02a0 }
            int r5 = java.lang.Math.max(r15, r5)     // Catch:{ SQLiteException -> 0x02a0 }
            if (r0 >= r5) goto L_0x024b
            goto L_0x0265
        L_0x024b:
            if (r3 == 0) goto L_0x0250
            r3.close()
        L_0x0250:
            return
        L_0x0251:
            r0 = move-exception
            r6 = 0
            r11 = 2
            com.google.android.gms.measurement.internal.ff r5 = r1.f393011w     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.internal.dx r5 = r5.mo120965ar()     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392795c     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r7 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r17)     // Catch:{ SQLiteException -> 0x02a0 }
            r5.mo120896c(r7, r8, r0)     // Catch:{ SQLiteException -> 0x02a0 }
        L_0x0265:
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x02a0 }
            if (r0 != 0) goto L_0x017e
            if (r3 == 0) goto L_0x02c6
            r3.close()
            return
        L_0x0271:
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r17)     // Catch:{ SQLiteException -> 0x02a0 }
            r0.mo120895b(r2, r4)     // Catch:{ SQLiteException -> 0x02a0 }
            if (r3 == 0) goto L_0x0287
            r3.close()
        L_0x0287:
            return
        L_0x0288:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ SQLiteException -> 0x02a0 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r17)     // Catch:{ SQLiteException -> 0x02a0 }
            r2.mo120896c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x02a0 }
            if (r3 == 0) goto L_0x029f
            r3.close()
        L_0x029f:
            return
        L_0x02a0:
            r0 = move-exception
            r4 = r17
            goto L_0x02b0
        L_0x02a4:
            r0 = move-exception
            r6 = r4
            r4 = r6
            goto L_0x02b0
        L_0x02a8:
            r0 = move-exception
            r6 = r4
            r4 = r6
            goto L_0x02c9
        L_0x02ac:
            r0 = move-exception
            r6 = r4
            r3 = r6
            r4 = r3
        L_0x02b0:
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w     // Catch:{ all -> 0x02c7 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x02c7 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x02c7 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r4)     // Catch:{ all -> 0x02c7 }
            r2.mo120896c(r5, r4, r0)     // Catch:{ all -> 0x02c7 }
            if (r3 == 0) goto L_0x02c6
            r3.close()
        L_0x02c6:
            return
        L_0x02c7:
            r0 = move-exception
            r4 = r3
        L_0x02c9:
            if (r4 == 0) goto L_0x02ce
            r4.close()
        L_0x02ce:
            goto L_0x02d0
        L_0x02cf:
            throw r0
        L_0x02d0:
            goto L_0x02cf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145228ah.mo120801F(long, long, com.google.android.gms.measurement.internal.jw):void");
    }

    /* renamed from: G */
    public final void mo120802G(String str, Long l, long j, C145126ad adVar) {
        mo120904g();
        mo121194J();
        C143919bh.m233958a(adVar);
        C143919bh.m233969l(str);
        byte[] byteArray = adVar.toByteArray();
        this.f393011w.mo120965ar().f392803k.mo120896c("Saving complex main event, appId, data size", this.f393011w.f392942l.mo120890c(str), Integer.valueOf(byteArray.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", byteArray);
        try {
            if (mo120806d().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) == -1) {
                this.f393011w.mo120965ar().f392795c.mo120895b("Failed to insert complex main event (got -1). appId", C145325dx.m236116a(str));
            }
        } catch (SQLiteException e) {
            this.f393011w.mo120965ar().f392795c.mo120896c("Error storing complex main event. appId", C145325dx.m236116a(str), e);
        }
    }

    /* renamed from: a */
    public final long mo120803a(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo120806d().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            this.f393011w.mo120965ar().f392795c.mo120896c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final long mo120804b(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo120806d().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j;
        } catch (SQLiteException e) {
            this.f393011w.mo120965ar().f392795c.mo120896c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo120805c() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final SQLiteDatabase mo120806d() {
        mo120904g();
        try {
            return this.f392578j.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f393011w.mo120965ar().f392798f.mo120895b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cd  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo120807e(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo120904g()
            r7.mo121194J()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo120806d()     // Catch:{ SQLiteException -> 0x00b4, all -> 0x00b2 }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00b4, all -> 0x00b2 }
            r3 = 0
            r2[r3] = r8     // Catch:{ SQLiteException -> 0x00b4, all -> 0x00b2 }
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x00b4, all -> 0x00b2 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00b0 }
            if (r2 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.ff r8 = r7.f393011w     // Catch:{ SQLiteException -> 0x00b0 }
            com.google.android.gms.measurement.internal.dx r8 = r8.mo120965ar()     // Catch:{ SQLiteException -> 0x00b0 }
            com.google.android.gms.measurement.internal.dv r8 = r8.f392803k     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r2 = "Default event parameters not found"
            r8.mo120894a(r2)     // Catch:{ SQLiteException -> 0x00b0 }
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            return r0
        L_0x0030:
            byte[] r2 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x00b0 }
            com.google.android.gms.measurement.a.ad r3 = com.google.android.gms.measurement.p10848a.C145126ad.f392211g     // Catch:{ IOException -> 0x0098 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ IOException -> 0x0098 }
            com.google.android.gms.measurement.a.ac r3 = (com.google.android.gms.measurement.p10848a.C145125ac) r3     // Catch:{ IOException -> 0x0098 }
            com.google.protobuf.ds r2 = com.google.android.gms.measurement.internal.C145491ka.m236458k(r3, r2)     // Catch:{ IOException -> 0x0098 }
            com.google.android.gms.measurement.a.ac r2 = (com.google.android.gms.measurement.p10848a.C145125ac) r2     // Catch:{ IOException -> 0x0098 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ IOException -> 0x0098 }
            com.google.android.gms.measurement.a.ad r2 = (com.google.android.gms.measurement.p10848a.C145126ad) r2     // Catch:{ IOException -> 0x0098 }
            com.google.android.gms.measurement.internal.jy r8 = r7.f393327l     // Catch:{ SQLiteException -> 0x00b0 }
            com.google.android.gms.measurement.internal.ka r8 = r8.f393359g     // Catch:{ SQLiteException -> 0x00b0 }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r8)     // Catch:{ SQLiteException -> 0x00b0 }
            com.google.protobuf.cq r8 = r2.f392214b     // Catch:{ SQLiteException -> 0x00b0 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00b0 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00b0 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00b0 }
        L_0x005a:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00b0 }
            if (r3 == 0) goto L_0x0092
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00b0 }
            com.google.android.gms.measurement.a.ah r3 = (com.google.android.gms.measurement.p10848a.C145130ah) r3     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r4 = r3.f392227b     // Catch:{ SQLiteException -> 0x00b0 }
            int r5 = r3.f392226a     // Catch:{ SQLiteException -> 0x00b0 }
            r6 = r5 & 16
            if (r6 == 0) goto L_0x0074
            double r5 = r3.f392231f     // Catch:{ SQLiteException -> 0x00b0 }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00b0 }
            goto L_0x005a
        L_0x0074:
            r6 = r5 & 8
            if (r6 == 0) goto L_0x007e
            float r3 = r3.f392230e     // Catch:{ SQLiteException -> 0x00b0 }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00b0 }
            goto L_0x005a
        L_0x007e:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x0088
            java.lang.String r3 = r3.f392228c     // Catch:{ SQLiteException -> 0x00b0 }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00b0 }
            goto L_0x005a
        L_0x0088:
            r5 = r5 & 4
            if (r5 == 0) goto L_0x005a
            long r5 = r3.f392229d     // Catch:{ SQLiteException -> 0x00b0 }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00b0 }
            goto L_0x005a
        L_0x0092:
            if (r1 == 0) goto L_0x0097
            r1.close()
        L_0x0097:
            return r2
        L_0x0098:
            r2 = move-exception
            com.google.android.gms.measurement.internal.ff r3 = r7.f393011w     // Catch:{ SQLiteException -> 0x00b0 }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ SQLiteException -> 0x00b0 }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r8)     // Catch:{ SQLiteException -> 0x00b0 }
            r3.mo120896c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00b0 }
            if (r1 == 0) goto L_0x00af
            r1.close()
        L_0x00af:
            return r0
        L_0x00b0:
            r8 = move-exception
            goto L_0x00b6
        L_0x00b2:
            r8 = move-exception
            goto L_0x00cb
        L_0x00b4:
            r8 = move-exception
            r1 = r0
        L_0x00b6:
            com.google.android.gms.measurement.internal.ff r2 = r7.f393011w     // Catch:{ all -> 0x00c9 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x00c9 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x00c9 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.mo120895b(r3, r8)     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x00c8
            r1.close()
        L_0x00c8:
            return r0
        L_0x00c9:
            r8 = move-exception
            r0 = r1
        L_0x00cb:
            if (r0 == 0) goto L_0x00d0
            r0.close()
        L_0x00d0:
            goto L_0x00d2
        L_0x00d1:
            throw r8
        L_0x00d2:
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145228ah.mo120807e(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x016f A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0171 A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x018e A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0190 A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01ad A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01af A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01cc A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01ce A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01ee A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01f2 A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x021a A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x021c A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0239 A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x023b A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0252 A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x026e A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0271 A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0280 A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02be A[Catch:{ SQLiteException -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02f6  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C145382g mo120808f(java.lang.String r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            com.google.android.gms.common.internal.C143919bh.m233969l(r24)
            r23.mo120904g()
            r23.mo121194J()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r23.mo120806d()     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            r0 = 29
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "app_instance_id"
            r12 = 0
            r6[r12] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "gmp_app_id"
            r13 = 1
            r6[r13] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "resettable_device_id_hash"
            r14 = 2
            r6[r14] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "last_bundle_index"
            r15 = 3
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "last_bundle_start_timestamp"
            r11 = 4
            r6[r11] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "last_bundle_end_timestamp"
            r10 = 5
            r6[r10] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "app_version"
            r9 = 6
            r6[r9] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "app_store"
            r8 = 7
            r6[r8] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "gmp_version"
            r7 = 8
            r6[r7] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "dev_cert_hash"
            r5 = 9
            r6[r5] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "measurement_enabled"
            r15 = 10
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "day"
            r15 = 11
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "daily_public_events_count"
            r15 = 12
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "daily_events_count"
            r15 = 13
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "daily_conversions_count"
            r15 = 14
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "config_fetched_time"
            r15 = 15
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "failed_config_fetch_time"
            r15 = 16
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "app_version_int"
            r15 = 17
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "firebase_instance_id"
            r16 = 18
            r6[r16] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "daily_error_events_count"
            r16 = 19
            r6[r16] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "daily_realtime_events_count"
            r16 = 20
            r6[r16] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "health_monitor_sample"
            r16 = 21
            r6[r16] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "android_id"
            r16 = 22
            r6[r16] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "adid_reporting_enabled"
            r15 = 23
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "admob_app_id"
            r17 = 24
            r6[r17] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "dynamite_version"
            r15 = 25
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "safelisted_events"
            r15 = 26
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "ga_app_id"
            r18 = 27
            r6[r18] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r0 = "session_stitching_token"
            r18 = 28
            r6[r18] = r0     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            r0[r12] = r2     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            java.lang.String r18 = "apps"
            java.lang.String r19 = "app_id=?"
            r20 = 0
            r21 = 0
            r22 = 0
            r15 = 9
            r5 = r18
            r15 = 8
            r7 = r19
            r15 = 7
            r8 = r0
            r0 = 6
            r9 = r20
            r15 = 5
            r10 = r21
            r0 = 4
            r11 = r22
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x02d9, all -> 0x02d7 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x02d5 }
            if (r5 != 0) goto L_0x00ed
            if (r4 == 0) goto L_0x00ec
            r4.close()
        L_0x00ec:
            return r3
        L_0x00ed:
            com.google.android.gms.measurement.internal.g r5 = new com.google.android.gms.measurement.internal.g     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.jy r6 = r1.f393327l     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.ff r6 = r6.f393363k     // Catch:{ SQLiteException -> 0x02d5 }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x02d5 }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121048x(r6)     // Catch:{ SQLiteException -> 0x02d5 }
            java.lang.String r6 = r4.getString(r13)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121012G(r6)     // Catch:{ SQLiteException -> 0x02d5 }
            java.lang.String r6 = r4.getString(r14)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121019N(r6)     // Catch:{ SQLiteException -> 0x02d5 }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121016K(r6)     // Catch:{ SQLiteException -> 0x02d5 }
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121017L(r6)     // Catch:{ SQLiteException -> 0x02d5 }
            long r6 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121015J(r6)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 6
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121050z(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 7
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121049y(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 8
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121013H(r6)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 9
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121008C(r6)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 10
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            if (r6 != 0) goto L_0x0154
            int r0 = r4.getInt(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            if (r0 == 0) goto L_0x0152
            goto L_0x0154
        L_0x0152:
            r0 = 0
            goto L_0x0155
        L_0x0154:
            r0 = 1
        L_0x0155:
            r5.mo121018M(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 11
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.ff r0 = r5.f393018a     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.fc r0 = r0.mo120966as()     // Catch:{ SQLiteException -> 0x02d5 }
            r0.mo120904g()     // Catch:{ SQLiteException -> 0x02d5 }
            boolean r0 = r5.f393027j     // Catch:{ SQLiteException -> 0x02d5 }
            long r8 = r5.f393020c     // Catch:{ SQLiteException -> 0x02d5 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0171
            r8 = 1
            goto L_0x0172
        L_0x0171:
            r8 = 0
        L_0x0172:
            r0 = r0 | r8
            r5.f393027j = r0     // Catch:{ SQLiteException -> 0x02d5 }
            r5.f393020c = r6     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 12
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.ff r0 = r5.f393018a     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.fc r0 = r0.mo120966as()     // Catch:{ SQLiteException -> 0x02d5 }
            r0.mo120904g()     // Catch:{ SQLiteException -> 0x02d5 }
            boolean r0 = r5.f393027j     // Catch:{ SQLiteException -> 0x02d5 }
            long r8 = r5.f393021d     // Catch:{ SQLiteException -> 0x02d5 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0190
            r8 = 1
            goto L_0x0191
        L_0x0190:
            r8 = 0
        L_0x0191:
            r0 = r0 | r8
            r5.f393027j = r0     // Catch:{ SQLiteException -> 0x02d5 }
            r5.f393021d = r6     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 13
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.ff r0 = r5.f393018a     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.fc r0 = r0.mo120966as()     // Catch:{ SQLiteException -> 0x02d5 }
            r0.mo120904g()     // Catch:{ SQLiteException -> 0x02d5 }
            boolean r0 = r5.f393027j     // Catch:{ SQLiteException -> 0x02d5 }
            long r8 = r5.f393022e     // Catch:{ SQLiteException -> 0x02d5 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x01af
            r8 = 1
            goto L_0x01b0
        L_0x01af:
            r8 = 0
        L_0x01b0:
            r0 = r0 | r8
            r5.f393027j = r0     // Catch:{ SQLiteException -> 0x02d5 }
            r5.f393022e = r6     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 14
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.ff r0 = r5.f393018a     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.fc r0 = r0.mo120966as()     // Catch:{ SQLiteException -> 0x02d5 }
            r0.mo120904g()     // Catch:{ SQLiteException -> 0x02d5 }
            boolean r0 = r5.f393027j     // Catch:{ SQLiteException -> 0x02d5 }
            long r8 = r5.f393023f     // Catch:{ SQLiteException -> 0x02d5 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x01ce
            r8 = 1
            goto L_0x01cf
        L_0x01ce:
            r8 = 0
        L_0x01cf:
            r0 = r0 | r8
            r5.f393027j = r0     // Catch:{ SQLiteException -> 0x02d5 }
            r5.f393023f = r6     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 15
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121007B(r6)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 16
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121010E(r6)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 17
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            if (r6 == 0) goto L_0x01f2
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x01f7
        L_0x01f2:
            int r0 = r4.getInt(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            long r6 = (long) r0     // Catch:{ SQLiteException -> 0x02d5 }
        L_0x01f7:
            r5.mo121006A(r6)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 18
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121011F(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 19
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.ff r0 = r5.f393018a     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.fc r0 = r0.mo120966as()     // Catch:{ SQLiteException -> 0x02d5 }
            r0.mo120904g()     // Catch:{ SQLiteException -> 0x02d5 }
            boolean r0 = r5.f393027j     // Catch:{ SQLiteException -> 0x02d5 }
            long r8 = r5.f393024g     // Catch:{ SQLiteException -> 0x02d5 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x021c
            r8 = 1
            goto L_0x021d
        L_0x021c:
            r8 = 0
        L_0x021d:
            r0 = r0 | r8
            r5.f393027j = r0     // Catch:{ SQLiteException -> 0x02d5 }
            r5.f393024g = r6     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 20
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.ff r0 = r5.f393018a     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.fc r0 = r0.mo120966as()     // Catch:{ SQLiteException -> 0x02d5 }
            r0.mo120904g()     // Catch:{ SQLiteException -> 0x02d5 }
            boolean r0 = r5.f393027j     // Catch:{ SQLiteException -> 0x02d5 }
            long r8 = r5.f393025h     // Catch:{ SQLiteException -> 0x02d5 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x023b
            r8 = 1
            goto L_0x023c
        L_0x023b:
            r8 = 0
        L_0x023c:
            r0 = r0 | r8
            r5.f393027j = r0     // Catch:{ SQLiteException -> 0x02d5 }
            r5.f393025h = r6     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 21
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121014I(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 23
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            if (r6 != 0) goto L_0x025a
            int r0 = r4.getInt(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            if (r0 == 0) goto L_0x0259
            goto L_0x025a
        L_0x0259:
            r13 = 0
        L_0x025a:
            r5.mo121047w(r13)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121046v(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            if (r6 == 0) goto L_0x0271
            r6 = 0
            goto L_0x0275
        L_0x0271:
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02d5 }
        L_0x0275:
            r5.mo121009D(r6)     // Catch:{ SQLiteException -> 0x02d5 }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            if (r6 != 0) goto L_0x0292
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x02d5 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121020O(r0)     // Catch:{ SQLiteException -> 0x02d5 }
        L_0x0292:
            boolean r0 = p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68893aw.m99823c()     // Catch:{ SQLiteException -> 0x02d5 }
            if (r0 == 0) goto L_0x02ad
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.ab r0 = r0.f392937g     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.dk r6 = com.google.android.gms.measurement.internal.C145313dl.f392728ah     // Catch:{ SQLiteException -> 0x02d5 }
            boolean r0 = r0.mo120776m(r3, r6)     // Catch:{ SQLiteException -> 0x02d5 }
            if (r0 == 0) goto L_0x02ad
            r0 = 28
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02d5 }
            r5.mo121021P(r0)     // Catch:{ SQLiteException -> 0x02d5 }
        L_0x02ad:
            com.google.android.gms.measurement.internal.ff r0 = r5.f393018a     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.fc r0 = r0.mo120966as()     // Catch:{ SQLiteException -> 0x02d5 }
            r0.mo120904g()     // Catch:{ SQLiteException -> 0x02d5 }
            r5.f393027j = r12     // Catch:{ SQLiteException -> 0x02d5 }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x02d5 }
            if (r0 == 0) goto L_0x02cf
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ SQLiteException -> 0x02d5 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c     // Catch:{ SQLiteException -> 0x02d5 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r24)     // Catch:{ SQLiteException -> 0x02d5 }
            r0.mo120895b(r6, r7)     // Catch:{ SQLiteException -> 0x02d5 }
        L_0x02cf:
            if (r4 == 0) goto L_0x02d4
            r4.close()
        L_0x02d4:
            return r5
        L_0x02d5:
            r0 = move-exception
            goto L_0x02db
        L_0x02d7:
            r0 = move-exception
            goto L_0x02f4
        L_0x02d9:
            r0 = move-exception
            r4 = r3
        L_0x02db:
            com.google.android.gms.measurement.internal.ff r5 = r1.f393011w     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.dx r5 = r5.mo120965ar()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392795c     // Catch:{ all -> 0x02f2 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r24)     // Catch:{ all -> 0x02f2 }
            r5.mo120896c(r6, r2, r0)     // Catch:{ all -> 0x02f2 }
            if (r4 == 0) goto L_0x02f1
            r4.close()
        L_0x02f1:
            return r3
        L_0x02f2:
            r0 = move-exception
            r3 = r4
        L_0x02f4:
            if (r3 == 0) goto L_0x02f9
            r3.close()
        L_0x02f9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145228ah.mo120808f(java.lang.String):com.google.android.gms.measurement.internal.g");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x015c  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel mo120809h(java.lang.String r34, java.lang.String r35) {
        /*
            r33 = this;
            r1 = r33
            r8 = r35
            com.google.android.gms.common.internal.C143919bh.m233969l(r34)
            com.google.android.gms.common.internal.C143919bh.m233969l(r35)
            r33.mo120904g()
            r33.mo121194J()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r33.mo120806d()     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            r0 = 11
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            java.lang.String r0 = "origin"
            r2 = 0
            r12[r2] = r0     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            java.lang.String r0 = "value"
            r3 = 1
            r12[r3] = r0     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            java.lang.String r0 = "active"
            r4 = 2
            r12[r4] = r0     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            java.lang.String r0 = "trigger_event_name"
            r5 = 3
            r12[r5] = r0     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            java.lang.String r0 = "trigger_timeout"
            r6 = 4
            r12[r6] = r0     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            java.lang.String r0 = "timed_out_event"
            r7 = 5
            r12[r7] = r0     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            java.lang.String r0 = "creation_timestamp"
            r15 = 6
            r12[r15] = r0     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            java.lang.String r0 = "triggered_event"
            r14 = 7
            r12[r14] = r0     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            java.lang.String r0 = "triggered_timestamp"
            r13 = 8
            r12[r13] = r0     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            java.lang.String r0 = "time_to_live"
            r11 = 9
            r12[r11] = r0     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            java.lang.String r0 = "expired_event"
            r7 = 10
            r12[r7] = r0     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            r0[r2] = r34     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            r0[r3] = r8     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            java.lang.String r16 = "conditional_properties"
            java.lang.String r17 = "app_id=? and name=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r7 = 9
            r11 = r16
            r7 = 8
            r13 = r17
            r7 = 7
            r14 = r0
            r0 = 6
            r15 = r18
            r16 = r19
            r17 = r20
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            boolean r11 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0133 }
            if (r11 != 0) goto L_0x0084
            if (r10 == 0) goto L_0x0083
            r10.close()
        L_0x0083:
            return r9
        L_0x0084:
            java.lang.String r11 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x0133 }
            if (r11 != 0) goto L_0x008c
            java.lang.String r11 = ""
        L_0x008c:
            r20 = r11
            java.lang.Object r11 = r1.mo120813l(r10, r3)     // Catch:{ SQLiteException -> 0x0133 }
            int r4 = r10.getInt(r4)     // Catch:{ SQLiteException -> 0x0133 }
            if (r4 == 0) goto L_0x009b
            r24 = 1
            goto L_0x009d
        L_0x009b:
            r24 = 0
        L_0x009d:
            java.lang.String r25 = r10.getString(r5)     // Catch:{ SQLiteException -> 0x0133 }
            long r27 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.jy r2 = r1.f393327l     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.ka r2 = r2.f393359g     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r2)     // Catch:{ SQLiteException -> 0x0133 }
            r3 = 5
            byte[] r3 = r10.getBlob(r3)     // Catch:{ SQLiteException -> 0x0133 }
            android.os.Parcelable$Creator r4 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ SQLiteException -> 0x0133 }
            android.os.Parcelable r2 = r2.mo121234e(r3, r4)     // Catch:{ SQLiteException -> 0x0133 }
            r26 = r2
            com.google.android.gms.measurement.internal.EventParcel r26 = (com.google.android.gms.measurement.internal.EventParcel) r26     // Catch:{ SQLiteException -> 0x0133 }
            long r12 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.jy r0 = r1.f393327l     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.ka r0 = r0.f393359g     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r0)     // Catch:{ SQLiteException -> 0x0133 }
            byte[] r2 = r10.getBlob(r7)     // Catch:{ SQLiteException -> 0x0133 }
            android.os.Parcelable$Creator r3 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ SQLiteException -> 0x0133 }
            android.os.Parcelable r0 = r0.mo121234e(r2, r3)     // Catch:{ SQLiteException -> 0x0133 }
            r29 = r0
            com.google.android.gms.measurement.internal.EventParcel r29 = (com.google.android.gms.measurement.internal.EventParcel) r29     // Catch:{ SQLiteException -> 0x0133 }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0133 }
            r0 = 9
            long r30 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.jy r0 = r1.f393327l     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.ka r0 = r0.f393359g     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r0)     // Catch:{ SQLiteException -> 0x0133 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x0133 }
            android.os.Parcelable$Creator r3 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ SQLiteException -> 0x0133 }
            android.os.Parcelable r0 = r0.mo121234e(r2, r3)     // Catch:{ SQLiteException -> 0x0133 }
            r32 = r0
            com.google.android.gms.measurement.internal.EventParcel r32 = (com.google.android.gms.measurement.internal.EventParcel) r32     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r21 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ SQLiteException -> 0x0133 }
            r2 = r21
            r3 = r35
            r6 = r11
            r7 = r20
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel r0 = new com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel     // Catch:{ SQLiteException -> 0x0133 }
            r18 = r0
            r19 = r34
            r22 = r12
            r18.<init>(r19, r20, r21, r22, r24, r25, r26, r27, r29, r30, r32)     // Catch:{ SQLiteException -> 0x0133 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0133 }
            if (r2 == 0) goto L_0x012d
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ SQLiteException -> 0x0133 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r34)     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.ff r5 = r1.f393011w     // Catch:{ SQLiteException -> 0x0133 }
            com.google.android.gms.measurement.internal.ds r5 = r5.f392942l     // Catch:{ SQLiteException -> 0x0133 }
            java.lang.String r5 = r5.mo120892e(r8)     // Catch:{ SQLiteException -> 0x0133 }
            r2.mo120896c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0133 }
        L_0x012d:
            if (r10 == 0) goto L_0x0132
            r10.close()
        L_0x0132:
            return r0
        L_0x0133:
            r0 = move-exception
            goto L_0x0139
        L_0x0135:
            r0 = move-exception
            goto L_0x015a
        L_0x0137:
            r0 = move-exception
            r10 = r9
        L_0x0139:
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w     // Catch:{ all -> 0x0158 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x0158 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x0158 }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r34)     // Catch:{ all -> 0x0158 }
            com.google.android.gms.measurement.internal.ff r5 = r1.f393011w     // Catch:{ all -> 0x0158 }
            com.google.android.gms.measurement.internal.ds r5 = r5.f392942l     // Catch:{ all -> 0x0158 }
            java.lang.String r5 = r5.mo120892e(r8)     // Catch:{ all -> 0x0158 }
            r2.mo120897d(r3, r4, r5, r0)     // Catch:{ all -> 0x0158 }
            if (r10 == 0) goto L_0x0157
            r10.close()
        L_0x0157:
            return r9
        L_0x0158:
            r0 = move-exception
            r9 = r10
        L_0x015a:
            if (r9 == 0) goto L_0x015f
            r9.close()
        L_0x015f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145228ah.mo120809h(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0133  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C145226af mo120810i(long r23, java.lang.String r25, long r26, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "daily_realtime_events_count"
            java.lang.String r2 = "daily_error_events_count"
            java.lang.String r3 = "daily_conversions_count"
            java.lang.String r4 = "daily_public_events_count"
            java.lang.String r5 = "daily_events_count"
            java.lang.String r6 = "day"
            com.google.android.gms.common.internal.C143919bh.m233969l(r25)
            r22.mo120904g()
            r22.mo121194J()
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]
            r9 = 0
            r8[r9] = r25
            com.google.android.gms.measurement.internal.af r10 = new com.google.android.gms.measurement.internal.af
            r10.<init>()
            android.database.sqlite.SQLiteDatabase r15 = r22.mo120806d()     // Catch:{ SQLiteException -> 0x0118, all -> 0x0115 }
            r12 = 6
            java.lang.String[] r14 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0118, all -> 0x0115 }
            r14[r9] = r6     // Catch:{ SQLiteException -> 0x0118, all -> 0x0115 }
            r14[r7] = r5     // Catch:{ SQLiteException -> 0x0118, all -> 0x0115 }
            r13 = 2
            r14[r13] = r4     // Catch:{ SQLiteException -> 0x0118, all -> 0x0115 }
            r12 = 3
            r14[r12] = r3     // Catch:{ SQLiteException -> 0x0118, all -> 0x0115 }
            r11 = 4
            r14[r11] = r2     // Catch:{ SQLiteException -> 0x0118, all -> 0x0115 }
            r11 = 5
            r14[r11] = r0     // Catch:{ SQLiteException -> 0x0118, all -> 0x0115 }
            java.lang.String[] r11 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x0118, all -> 0x0115 }
            r11[r9] = r25     // Catch:{ SQLiteException -> 0x0118, all -> 0x0115 }
            java.lang.String r16 = "apps"
            java.lang.String r17 = "app_id=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r12 = r15
            r13 = r16
            r21 = r15
            r15 = r17
            r16 = r11
            r17 = r18
            r18 = r19
            r19 = r20
            android.database.Cursor r11 = r12.query(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0118, all -> 0x0115 }
            boolean r12 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0113 }
            if (r12 != 0) goto L_0x0077
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w     // Catch:{ SQLiteException -> 0x0113 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ SQLiteException -> 0x0113 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f     // Catch:{ SQLiteException -> 0x0113 }
            java.lang.String r2 = "Not updating daily counts, app is not known. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r25)     // Catch:{ SQLiteException -> 0x0113 }
            r0.mo120895b(r2, r3)     // Catch:{ SQLiteException -> 0x0113 }
            if (r11 == 0) goto L_0x0076
            r11.close()
        L_0x0076:
            return r10
        L_0x0077:
            long r12 = r11.getLong(r9)     // Catch:{ SQLiteException -> 0x0113 }
            int r9 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r9 != 0) goto L_0x00a1
            long r12 = r11.getLong(r7)     // Catch:{ SQLiteException -> 0x0113 }
            r10.f392564b = r12     // Catch:{ SQLiteException -> 0x0113 }
            r7 = 2
            long r12 = r11.getLong(r7)     // Catch:{ SQLiteException -> 0x0113 }
            r10.f392563a = r12     // Catch:{ SQLiteException -> 0x0113 }
            r7 = 3
            long r12 = r11.getLong(r7)     // Catch:{ SQLiteException -> 0x0113 }
            r10.f392565c = r12     // Catch:{ SQLiteException -> 0x0113 }
            r7 = 4
            long r12 = r11.getLong(r7)     // Catch:{ SQLiteException -> 0x0113 }
            r10.f392566d = r12     // Catch:{ SQLiteException -> 0x0113 }
            r7 = 5
            long r12 = r11.getLong(r7)     // Catch:{ SQLiteException -> 0x0113 }
            r10.f392567e = r12     // Catch:{ SQLiteException -> 0x0113 }
        L_0x00a1:
            if (r28 == 0) goto L_0x00a9
            long r12 = r10.f392564b     // Catch:{ SQLiteException -> 0x0113 }
            long r12 = r12 + r26
            r10.f392564b = r12     // Catch:{ SQLiteException -> 0x0113 }
        L_0x00a9:
            if (r29 == 0) goto L_0x00b1
            long r12 = r10.f392563a     // Catch:{ SQLiteException -> 0x0113 }
            long r12 = r12 + r26
            r10.f392563a = r12     // Catch:{ SQLiteException -> 0x0113 }
        L_0x00b1:
            if (r30 == 0) goto L_0x00b9
            long r12 = r10.f392565c     // Catch:{ SQLiteException -> 0x0113 }
            long r12 = r12 + r26
            r10.f392565c = r12     // Catch:{ SQLiteException -> 0x0113 }
        L_0x00b9:
            if (r31 == 0) goto L_0x00c1
            long r12 = r10.f392566d     // Catch:{ SQLiteException -> 0x0113 }
            long r12 = r12 + r26
            r10.f392566d = r12     // Catch:{ SQLiteException -> 0x0113 }
        L_0x00c1:
            if (r32 == 0) goto L_0x00c9
            long r12 = r10.f392567e     // Catch:{ SQLiteException -> 0x0113 }
            long r12 = r12 + r26
            r10.f392567e = r12     // Catch:{ SQLiteException -> 0x0113 }
        L_0x00c9:
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0113 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x0113 }
            java.lang.Long r9 = java.lang.Long.valueOf(r23)     // Catch:{ SQLiteException -> 0x0113 }
            r7.put(r6, r9)     // Catch:{ SQLiteException -> 0x0113 }
            long r12 = r10.f392563a     // Catch:{ SQLiteException -> 0x0113 }
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ SQLiteException -> 0x0113 }
            r7.put(r4, r6)     // Catch:{ SQLiteException -> 0x0113 }
            long r12 = r10.f392564b     // Catch:{ SQLiteException -> 0x0113 }
            java.lang.Long r4 = java.lang.Long.valueOf(r12)     // Catch:{ SQLiteException -> 0x0113 }
            r7.put(r5, r4)     // Catch:{ SQLiteException -> 0x0113 }
            long r4 = r10.f392565c     // Catch:{ SQLiteException -> 0x0113 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x0113 }
            r7.put(r3, r4)     // Catch:{ SQLiteException -> 0x0113 }
            long r3 = r10.f392566d     // Catch:{ SQLiteException -> 0x0113 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0113 }
            r7.put(r2, r3)     // Catch:{ SQLiteException -> 0x0113 }
            long r2 = r10.f392567e     // Catch:{ SQLiteException -> 0x0113 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteException -> 0x0113 }
            r7.put(r0, r2)     // Catch:{ SQLiteException -> 0x0113 }
            java.lang.String r0 = "apps"
            java.lang.String r2 = "app_id=?"
            r3 = r21
            r3.update(r0, r7, r2, r8)     // Catch:{ SQLiteException -> 0x0113 }
            if (r11 == 0) goto L_0x0110
            r11.close()
        L_0x0110:
            return r10
        L_0x0111:
            r0 = move-exception
            goto L_0x0131
        L_0x0113:
            r0 = move-exception
            goto L_0x011a
        L_0x0115:
            r0 = move-exception
            r11 = 0
            goto L_0x0131
        L_0x0118:
            r0 = move-exception
            r11 = 0
        L_0x011a:
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w     // Catch:{ all -> 0x0111 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x0111 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x0111 }
            java.lang.String r3 = "Error updating daily counts. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r25)     // Catch:{ all -> 0x0111 }
            r2.mo120896c(r3, r4, r0)     // Catch:{ all -> 0x0111 }
            if (r11 == 0) goto L_0x0130
            r11.close()
        L_0x0130:
            return r10
        L_0x0131:
            if (r11 == 0) goto L_0x0136
            r11.close()
        L_0x0136:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145228ah.mo120810i(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.af");
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C145234an mo120811j(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r1 = r29
            r15 = r31
            com.google.android.gms.common.internal.C143919bh.m233969l(r30)
            com.google.android.gms.common.internal.C143919bh.m233969l(r31)
            r29.mo120904g()
            r29.mo121194J()
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 9
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = "lifetime_count"
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "current_bundle_count"
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "last_fire_timestamp"
            r6 = 2
            r2[r6] = r3
            java.lang.String r3 = "last_bundled_timestamp"
            r7 = 3
            r2[r7] = r3
            java.lang.String r3 = "last_bundled_day"
            r8 = 4
            r2[r8] = r3
            java.lang.String r3 = "last_sampled_complex_event_id"
            r9 = 5
            r2[r9] = r3
            java.lang.String r3 = "last_sampling_rate"
            r10 = 6
            r2[r10] = r3
            java.lang.String r3 = "last_exempt_from_sampling"
            r11 = 7
            r2[r11] = r3
            java.lang.String r3 = "current_session_count"
            r12 = 8
            r2[r12] = r3
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r20 = r29.mo120806d()     // Catch:{ SQLiteException -> 0x0143, all -> 0x0141 }
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0143, all -> 0x0141 }
            java.lang.Object[] r0 = r0.toArray(r2)     // Catch:{ SQLiteException -> 0x0143, all -> 0x0141 }
            r22 = r0
            java.lang.String[] r22 = (java.lang.String[]) r22     // Catch:{ SQLiteException -> 0x0143, all -> 0x0141 }
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0143, all -> 0x0141 }
            r0[r4] = r30     // Catch:{ SQLiteException -> 0x0143, all -> 0x0141 }
            r0[r5] = r15     // Catch:{ SQLiteException -> 0x0143, all -> 0x0141 }
            java.lang.String r21 = "events"
            java.lang.String r23 = "app_id=? and name=?"
            r25 = 0
            r26 = 0
            r27 = 0
            r24 = r0
            android.database.Cursor r13 = r20.query(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ SQLiteException -> 0x0143, all -> 0x0141 }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            if (r0 != 0) goto L_0x007d
            if (r13 == 0) goto L_0x007c
            r13.close()
        L_0x007c:
            return r19
        L_0x007d:
            long r16 = r13.getLong(r4)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            long r20 = r13.getLong(r5)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            long r22 = r13.getLong(r6)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            boolean r0 = r13.isNull(r7)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r2 = 0
            if (r0 == 0) goto L_0x0094
            r24 = r2
            goto L_0x009a
        L_0x0094:
            long r6 = r13.getLong(r7)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r24 = r6
        L_0x009a:
            boolean r0 = r13.isNull(r8)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            if (r0 == 0) goto L_0x00a3
            r0 = r19
            goto L_0x00ab
        L_0x00a3:
            long r6 = r13.getLong(r8)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
        L_0x00ab:
            boolean r6 = r13.isNull(r9)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            if (r6 == 0) goto L_0x00b4
            r18 = r19
            goto L_0x00be
        L_0x00b4:
            long r6 = r13.getLong(r9)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r18 = r6
        L_0x00be:
            boolean r6 = r13.isNull(r10)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            if (r6 == 0) goto L_0x00c7
            r26 = r19
            goto L_0x00d1
        L_0x00c7:
            long r6 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r26 = r6
        L_0x00d1:
            boolean r6 = r13.isNull(r11)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            if (r6 != 0) goto L_0x00e9
            long r6 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r8 = 1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x00e2
            r4 = 1
        L_0x00e2:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r27 = r4
            goto L_0x00eb
        L_0x00e9:
            r27 = r19
        L_0x00eb:
            boolean r4 = r13.isNull(r12)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            if (r4 == 0) goto L_0x00f3
        L_0x00f1:
            r9 = r2
            goto L_0x00f8
        L_0x00f3:
            long r2 = r13.getLong(r12)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            goto L_0x00f1
        L_0x00f8:
            com.google.android.gms.measurement.internal.an r28 = new com.google.android.gms.measurement.internal.an     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r2 = r28
            r3 = r30
            r4 = r31
            r5 = r16
            r7 = r20
            r11 = r22
            r20 = r13
            r13 = r24
            r15 = r0
            r16 = r18
            r17 = r26
            r18 = r27
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0133, all -> 0x0131 }
            boolean r0 = r20.moveToNext()     // Catch:{ SQLiteException -> 0x0133, all -> 0x0131 }
            if (r0 == 0) goto L_0x012b
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w     // Catch:{ SQLiteException -> 0x0133, all -> 0x0131 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ SQLiteException -> 0x0133, all -> 0x0131 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c     // Catch:{ SQLiteException -> 0x0133, all -> 0x0131 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r30)     // Catch:{ SQLiteException -> 0x0133, all -> 0x0131 }
            r0.mo120895b(r2, r3)     // Catch:{ SQLiteException -> 0x0133, all -> 0x0131 }
        L_0x012b:
            if (r20 == 0) goto L_0x0130
            r20.close()
        L_0x0130:
            return r28
        L_0x0131:
            r0 = move-exception
            goto L_0x0138
        L_0x0133:
            r0 = move-exception
            goto L_0x013e
        L_0x0135:
            r0 = move-exception
            r20 = r13
        L_0x0138:
            r19 = r20
            goto L_0x016a
        L_0x013b:
            r0 = move-exception
            r20 = r13
        L_0x013e:
            r13 = r20
            goto L_0x0146
        L_0x0141:
            r0 = move-exception
            goto L_0x016a
        L_0x0143:
            r0 = move-exception
            r13 = r19
        L_0x0146:
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w     // Catch:{ all -> 0x0167 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x0167 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x0167 }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r30)     // Catch:{ all -> 0x0167 }
            com.google.android.gms.measurement.internal.ff r5 = r1.f393011w     // Catch:{ all -> 0x0167 }
            com.google.android.gms.measurement.internal.ds r5 = r5.f392942l     // Catch:{ all -> 0x0167 }
            r6 = r31
            java.lang.String r5 = r5.mo120890c(r6)     // Catch:{ all -> 0x0167 }
            r2.mo120897d(r3, r4, r5, r0)     // Catch:{ all -> 0x0167 }
            if (r13 == 0) goto L_0x0166
            r13.close()
        L_0x0166:
            return r19
        L_0x0167:
            r0 = move-exception
            r19 = r13
        L_0x016a:
            if (r19 == 0) goto L_0x016f
            r19.close()
        L_0x016f:
            goto L_0x0171
        L_0x0170:
            throw r0
        L_0x0171:
            goto L_0x0170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145228ah.mo120811j(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.an");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C145493kc mo120812k(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.C143919bh.m233969l(r20)
            com.google.android.gms.common.internal.C143919bh.m233969l(r21)
            r19.mo120904g()
            r19.mo121194J()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.mo120806d()     // Catch:{ SQLiteException -> 0x0086, all -> 0x0084 }
            r0 = 3
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0086, all -> 0x0084 }
            java.lang.String r0 = "set_timestamp"
            r2 = 0
            r13[r2] = r0     // Catch:{ SQLiteException -> 0x0086, all -> 0x0084 }
            java.lang.String r0 = "value"
            r3 = 1
            r13[r3] = r0     // Catch:{ SQLiteException -> 0x0086, all -> 0x0084 }
            java.lang.String r0 = "origin"
            r4 = 2
            r13[r4] = r0     // Catch:{ SQLiteException -> 0x0086, all -> 0x0084 }
            java.lang.String[] r15 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0086, all -> 0x0084 }
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x0086, all -> 0x0084 }
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x0086, all -> 0x0084 }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0086, all -> 0x0084 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0082 }
            if (r0 != 0) goto L_0x0047
            if (r11 == 0) goto L_0x0046
            r11.close()
        L_0x0046:
            return r10
        L_0x0047:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0082 }
            java.lang.Object r8 = r1.mo120813l(r11, r3)     // Catch:{ SQLiteException -> 0x0082 }
            if (r8 != 0) goto L_0x0057
            if (r11 == 0) goto L_0x0056
            r11.close()
        L_0x0056:
            return r10
        L_0x0057:
            java.lang.String r4 = r11.getString(r4)     // Catch:{ SQLiteException -> 0x0082 }
            com.google.android.gms.measurement.internal.kc r0 = new com.google.android.gms.measurement.internal.kc     // Catch:{ SQLiteException -> 0x0082 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0082 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0082 }
            if (r2 == 0) goto L_0x007c
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w     // Catch:{ SQLiteException -> 0x0082 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ SQLiteException -> 0x0082 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ SQLiteException -> 0x0082 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r20)     // Catch:{ SQLiteException -> 0x0082 }
            r2.mo120895b(r3, r4)     // Catch:{ SQLiteException -> 0x0082 }
        L_0x007c:
            if (r11 == 0) goto L_0x0081
            r11.close()
        L_0x0081:
            return r0
        L_0x0082:
            r0 = move-exception
            goto L_0x0088
        L_0x0084:
            r0 = move-exception
            goto L_0x00a9
        L_0x0086:
            r0 = move-exception
            r11 = r10
        L_0x0088:
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r20)     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.ff r5 = r1.f393011w     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.ds r5 = r5.f392942l     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = r5.mo120892e(r9)     // Catch:{ all -> 0x00a7 }
            r2.mo120897d(r3, r4, r5, r0)     // Catch:{ all -> 0x00a7 }
            if (r11 == 0) goto L_0x00a6
            r11.close()
        L_0x00a6:
            return r10
        L_0x00a7:
            r0 = move-exception
            r10 = r11
        L_0x00a9:
            if (r10 == 0) goto L_0x00ae
            r10.close()
        L_0x00ae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145228ah.mo120812k(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.kc");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Object mo120813l(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.f393011w.mo120965ar().f392795c.mo120894a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                this.f393011w.mo120965ar().f392795c.mo120895b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f393011w.mo120965ar().f392795c.mo120894a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo120814m() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo120806d()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0026, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x0029
        L_0x0024:
            r0 = move-exception
            goto L_0x0040
        L_0x0026:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0029:
            com.google.android.gms.measurement.internal.ff r3 = r6.f393011w     // Catch:{ all -> 0x003c }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ all -> 0x003c }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ all -> 0x003c }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo120895b(r4, r2)     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x003b
            r0.close()
        L_0x003b:
            return r1
        L_0x003c:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            r1.close()
        L_0x0045:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145228ah.mo120814m():java.lang.String");
    }

    /* renamed from: n */
    public final List mo120815n(String str, String str2, String str3) {
        C143919bh.m233969l(str);
        mo120904g();
        mo121194J();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo120816o(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0190  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo120816o(java.lang.String r44, java.lang.String[] r45) {
        /*
            r43 = this;
            r1 = r43
            r43.mo120904g()
            r43.mo121194J()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            android.database.sqlite.SQLiteDatabase r2 = r43.mo120806d()     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r3 = "conditional_properties"
            r4 = 13
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r5 = "app_id"
            r12 = 0
            r4[r12] = r5     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r5 = "origin"
            r13 = 1
            r4[r13] = r5     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r5 = "name"
            r14 = 2
            r4[r14] = r5     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r5 = "value"
            r15 = 3
            r4[r15] = r5     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r5 = "active"
            r9 = 4
            r4[r9] = r5     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r5 = "trigger_event_name"
            r8 = 5
            r4[r8] = r5     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r5 = "trigger_timeout"
            r7 = 6
            r4[r7] = r5     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r5 = "timed_out_event"
            r6 = 7
            r4[r6] = r5     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r5 = "creation_timestamp"
            r11 = 8
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r5 = "triggered_event"
            r11 = 9
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r5 = "triggered_timestamp"
            r11 = 10
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r5 = "time_to_live"
            r11 = 11
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r5 = "expired_event"
            r11 = 12
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r21 = "rowid"
            com.google.android.gms.measurement.internal.ff r5 = r1.f393011w     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            com.google.android.gms.measurement.internal.ab r5 = r5.f392937g     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            r22 = 0
            r23 = 0
            r5 = r44
            r11 = 7
            r6 = r45
            r11 = 6
            r7 = r22
            r11 = 5
            r8 = r23
            r11 = 4
            r9 = r21
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0174, all -> 0x0171 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            if (r3 == 0) goto L_0x0165
        L_0x0081:
            int r3 = r0.size()     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.ff r4 = r1.f393011w     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.ab r5 = r4.f392937g     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r5) goto L_0x00a2
            com.google.android.gms.measurement.internal.dx r3 = r4.mo120965ar()     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            java.lang.String r4 = "Read more than the max allowed conditional properties, ignoring extra"
            com.google.android.gms.measurement.internal.ff r6 = r1.f393011w     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.ab r6 = r6.f392937g     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r3.mo120895b(r4, r5)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            goto L_0x015c
        L_0x00a2:
            java.lang.String r3 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            java.lang.String r10 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            java.lang.String r5 = r2.getString(r14)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            java.lang.Object r8 = r1.mo120813l(r2, r15)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            int r4 = r2.getInt(r11)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            if (r4 == 0) goto L_0x00bc
            r9 = 5
            r23 = 1
            goto L_0x00bf
        L_0x00bc:
            r9 = 5
            r23 = 0
        L_0x00bf:
            java.lang.String r25 = r2.getString(r9)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r6 = 6
            long r26 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.jy r4 = r1.f393327l     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.ka r4 = r4.f393359g     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r4)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r7 = 7
            byte[] r6 = r2.getBlob(r7)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            android.os.Parcelable$Creator r7 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            android.os.Parcelable r4 = r4.mo121234e(r6, r7)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r28 = r4
            com.google.android.gms.measurement.internal.EventParcel r28 = (com.google.android.gms.measurement.internal.EventParcel) r28     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r6 = 8
            long r29 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.jy r4 = r1.f393327l     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.ka r4 = r4.f393359g     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r4)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r7 = 9
            byte[] r6 = r2.getBlob(r7)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            android.os.Parcelable$Creator r7 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            android.os.Parcelable r4 = r4.mo121234e(r6, r7)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r31 = r4
            com.google.android.gms.measurement.internal.EventParcel r31 = (com.google.android.gms.measurement.internal.EventParcel) r31     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r6 = 10
            long r32 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r7 = 11
            long r34 = r2.getLong(r7)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.jy r4 = r1.f393327l     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.ka r4 = r4.f393359g     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r4)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r11 = 12
            byte[] r6 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            android.os.Parcelable$Creator r7 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            android.os.Parcelable r4 = r4.mo121234e(r6, r7)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r36 = r4
            com.google.android.gms.measurement.internal.EventParcel r36 = (com.google.android.gms.measurement.internal.EventParcel) r36     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.UserAttributeParcel r21 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r4 = r21
            r37 = 11
            r38 = 10
            r39 = 9
            r40 = 8
            r41 = 7
            r42 = 6
            r6 = r32
            r32 = 5
            r9 = r10
            r4.<init>(r5, r6, r8, r9)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel r4 = new com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r16 = r4
            r17 = r3
            r18 = r10
            r19 = r21
            r20 = r29
            r22 = r23
            r23 = r25
            r24 = r28
            r25 = r26
            r27 = r31
            r28 = r34
            r30 = r36
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r30)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            r0.add(r4)     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x016e, all -> 0x016b }
            if (r3 != 0) goto L_0x0162
        L_0x015c:
            if (r2 == 0) goto L_0x0161
            r2.close()
        L_0x0161:
            return r0
        L_0x0162:
            r11 = 4
            goto L_0x0081
        L_0x0165:
            if (r2 == 0) goto L_0x016a
            r2.close()
        L_0x016a:
            return r0
        L_0x016b:
            r0 = move-exception
            r11 = r2
            goto L_0x018e
        L_0x016e:
            r0 = move-exception
            r11 = r2
            goto L_0x0176
        L_0x0171:
            r0 = move-exception
            r11 = 0
            goto L_0x018e
        L_0x0174:
            r0 = move-exception
            r11 = 0
        L_0x0176:
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x018d }
            java.lang.String r3 = "Error querying conditional user property value"
            r2.mo120895b(r3, r0)     // Catch:{ all -> 0x018d }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x018d }
            if (r11 == 0) goto L_0x018c
            r11.close()
        L_0x018c:
            return r0
        L_0x018d:
            r0 = move-exception
        L_0x018e:
            if (r11 == 0) goto L_0x0193
            r11.close()
        L_0x0193:
            goto L_0x0195
        L_0x0194:
            throw r0
        L_0x0195:
            goto L_0x0194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145228ah.mo120816o(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* renamed from: p */
    public final List mo120817p(String str) {
        C143919bh.m233969l(str);
        mo120904g();
        mo121194J();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            C145222ab abVar = this.f393011w.f392937g;
            Cursor query = mo120806d().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = BuildConfig.FLAVOR;
                    }
                    String str2 = string2;
                    long j = query.getLong(2);
                    Object l = mo120813l(query, 3);
                    if (l == null) {
                        this.f393011w.mo120965ar().f392795c.mo120895b("Read invalid user property value, ignoring it. appId", C145325dx.m236116a(str));
                    } else {
                        arrayList.add(new C145493kc(str, str2, string, j, l));
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayList;
            }
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (SQLiteException e) {
            this.f393011w.mo120965ar().f392795c.mo120896c("Error querying user properties. appId", C145325dx.m236116a(str), e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0116, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0118, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0119, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011c, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011e, code lost:
        r15 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0138, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013f, code lost:
        r12.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0118 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013f  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo120818q(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r23
            com.google.android.gms.common.internal.C143919bh.m233969l(r21)
            r20.mo120904g()
            r20.mo121194J()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r11 = "1001"
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            r13 = 3
            r3.<init>(r13)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            r14 = r21
            r3.add(r14)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0118 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0116, all -> 0x0118 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0118 }
            boolean r5 = android.text.TextUtils.isEmpty(r22)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0118 }
            if (r5 != 0) goto L_0x0037
            r15 = r22
            r3.add(r15)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            java.lang.String r5 = " and origin=?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            goto L_0x0039
        L_0x0037:
            r15 = r22
        L_0x0039:
            boolean r5 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            if (r5 != 0) goto L_0x0058
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            r5.append(r0)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            java.lang.String r6 = "*"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            r3.add(r5)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            java.lang.String r5 = " and name glob ?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
        L_0x0058:
            int r5 = r3.size()     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            r7 = r3
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            android.database.sqlite.SQLiteDatabase r3 = r20.mo120806d()     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            java.lang.String r5 = "user_attributes"
            r6 = 4
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            java.lang.String r8 = "name"
            r10 = 0
            r6[r10] = r8     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            java.lang.String r8 = "set_timestamp"
            r9 = 1
            r6[r9] = r8     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            java.lang.String r8 = "value"
            r12 = 2
            r6[r12] = r8     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            java.lang.String r8 = "origin"
            r6[r13] = r8     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            java.lang.String r8 = r4.toString()     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            java.lang.String r17 = "rowid"
            com.google.android.gms.measurement.internal.ff r4 = r1.f393011w     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            com.google.android.gms.measurement.internal.ab r4 = r4.f392937g     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            r18 = 0
            r19 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r18
            r13 = 1
            r9 = r19
            r12 = 0
            r10 = r17
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0118 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            if (r4 != 0) goto L_0x00aa
            if (r3 == 0) goto L_0x00a9
            r3.close()
        L_0x00a9:
            return r2
        L_0x00aa:
            int r4 = r2.size()     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            com.google.android.gms.measurement.internal.ff r5 = r1.f393011w     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            com.google.android.gms.measurement.internal.ab r6 = r5.f392937g     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r6) goto L_0x00ca
            com.google.android.gms.measurement.internal.dx r0 = r5.mo120965ar()     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            com.google.android.gms.measurement.internal.ff r5 = r1.f393011w     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            com.google.android.gms.measurement.internal.ab r5 = r5.f392937g     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            r0.mo120895b(r4, r5)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            goto L_0x0108
        L_0x00ca:
            java.lang.String r7 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            long r8 = r3.getLong(r13)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            r11 = 2
            java.lang.Object r10 = r1.mo120813l(r3, r11)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            r6 = 3
            java.lang.String r15 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            if (r10 != 0) goto L_0x00f2
            com.google.android.gms.measurement.internal.ff r4 = r1.f393011w     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392795c     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            java.lang.String r5 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r21)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            r4.mo120897d(r5, r7, r15, r0)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            r16 = 3
            goto L_0x0101
        L_0x00f2:
            com.google.android.gms.measurement.internal.kc r5 = new com.google.android.gms.measurement.internal.kc     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            r4 = r5
            r11 = r5
            r5 = r21
            r16 = 3
            r6 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            r2.add(r11)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
        L_0x0101:
            boolean r4 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            if (r4 == 0) goto L_0x0108
            goto L_0x00aa
        L_0x0108:
            if (r3 == 0) goto L_0x010d
            r3.close()
        L_0x010d:
            return r2
        L_0x010e:
            r0 = move-exception
            r12 = r3
            goto L_0x013d
        L_0x0111:
            r0 = move-exception
            r12 = r3
            goto L_0x0121
        L_0x0114:
            r0 = move-exception
            goto L_0x0120
        L_0x0116:
            r0 = move-exception
            goto L_0x011e
        L_0x0118:
            r0 = move-exception
            r12 = 0
            goto L_0x013d
        L_0x011b:
            r0 = move-exception
            r14 = r21
        L_0x011e:
            r15 = r22
        L_0x0120:
            r12 = 0
        L_0x0121:
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w     // Catch:{ all -> 0x013c }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x013c }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x013c }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r21)     // Catch:{ all -> 0x013c }
            r2.mo120897d(r3, r4, r15, r0)     // Catch:{ all -> 0x013c }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x013c }
            if (r12 == 0) goto L_0x013b
            r12.close()
        L_0x013b:
            return r0
        L_0x013c:
            r0 = move-exception
        L_0x013d:
            if (r12 == 0) goto L_0x0142
            r12.close()
        L_0x0142:
            goto L_0x0144
        L_0x0143:
            throw r0
        L_0x0144:
            goto L_0x0143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145228ah.mo120818q(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: r */
    public final void mo120819r() {
        mo121194J();
        mo120806d().beginTransaction();
    }

    /* renamed from: s */
    public final void mo120820s(List list) {
        C143919bh.m233958a(list);
        mo120904g();
        mo121194J();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int delete = mo120806d().delete("raw_events", sb.toString(), (String[]) null);
        if (delete != list.size()) {
            this.f393011w.mo120965ar().f392795c.mo120896c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    /* renamed from: t */
    public final void mo120821t() {
        mo121194J();
        mo120806d().endTransaction();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo120822u() {
        mo120904g();
        mo121194J();
        if (mo120827z()) {
            C145336eh ehVar = this.f393327l.f393361i.f393281a;
            ehVar.mo120915a();
            long j = ehVar.f392834a;
            C144006f fVar = this.f393011w.f392924A;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - j);
            C145222ab abVar = this.f393011w.f392937g;
            if (abs > ((Long) C145313dl.f392758x.mo120854a((Object) null)).longValue()) {
                this.f393327l.f393361i.f393281a.mo120916b(elapsedRealtime);
                mo120904g();
                mo121194J();
                if (mo120827z()) {
                    SQLiteDatabase d = mo120806d();
                    C144006f fVar2 = this.f393011w.f392924A;
                    C145222ab abVar2 = this.f393011w.f392937g;
                    int delete = d.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(C145222ab.m235900s())});
                    if (delete > 0) {
                        this.f393011w.mo120965ar().f392803k.mo120895b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo120823v(String str, String str2) {
        C143919bh.m233969l(str);
        C143919bh.m233969l(str2);
        mo120904g();
        mo121194J();
        try {
            mo120806d().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f393011w.mo120965ar().f392795c.mo120897d("Error deleting user property. appId", C145325dx.m236116a(str), this.f393011w.f392942l.mo120892e(str2), e);
        }
    }

    /* renamed from: w */
    public final void mo120824w() {
        mo121194J();
        mo120806d().setTransactionSuccessful();
    }

    /* renamed from: x */
    public final void mo120825x(C145382g gVar) {
        mo120904g();
        mo121194J();
        String l = gVar.mo121036l();
        C143919bh.m233958a(l);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", l);
        contentValues.put("app_instance_id", gVar.mo121037m());
        contentValues.put("gmp_app_id", gVar.mo121041q());
        contentValues.put("resettable_device_id_hash", gVar.mo121042r());
        contentValues.put("last_bundle_index", Long.valueOf(gVar.mo121032h()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(gVar.mo121033i()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(gVar.mo121031g()));
        contentValues.put("app_version", gVar.mo121039o());
        contentValues.put("app_store", gVar.mo121038n());
        contentValues.put("gmp_version", Long.valueOf(gVar.mo121030f()));
        contentValues.put("dev_cert_hash", Long.valueOf(gVar.mo121027c()));
        contentValues.put("measurement_enabled", Boolean.valueOf(gVar.mo121023R()));
        gVar.f393018a.mo120966as().mo120904g();
        contentValues.put("day", Long.valueOf(gVar.f393020c));
        gVar.f393018a.mo120966as().mo120904g();
        contentValues.put("daily_public_events_count", Long.valueOf(gVar.f393021d));
        gVar.f393018a.mo120966as().mo120904g();
        contentValues.put("daily_events_count", Long.valueOf(gVar.f393022e));
        gVar.f393018a.mo120966as().mo120904g();
        contentValues.put("daily_conversions_count", Long.valueOf(gVar.f393023f));
        contentValues.put("config_fetched_time", Long.valueOf(gVar.mo121026b()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(gVar.mo121029e()));
        contentValues.put("app_version_int", Long.valueOf(gVar.mo121025a()));
        contentValues.put("firebase_instance_id", gVar.mo121040p());
        gVar.f393018a.mo120966as().mo120904g();
        contentValues.put("daily_error_events_count", Long.valueOf(gVar.f393024g));
        gVar.f393018a.mo120966as().mo120904g();
        contentValues.put("daily_realtime_events_count", Long.valueOf(gVar.f393025h));
        gVar.f393018a.mo120966as().mo120904g();
        contentValues.put("health_monitor_sample", gVar.f393026i);
        gVar.mo121024S();
        contentValues.put("android_id", 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(gVar.mo121022Q()));
        contentValues.put("admob_app_id", gVar.mo121035k());
        contentValues.put("dynamite_version", Long.valueOf(gVar.mo121028d()));
        contentValues.put("session_stitching_token", gVar.mo121043s());
        List t = gVar.mo121044t();
        if (t != null) {
            if (t.isEmpty()) {
                this.f393011w.mo120965ar().f392798f.mo120895b("Safelisted events should not be an empty list. appId", l);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", t));
            }
        }
        if (C68919m.m99936c() && this.f393011w.f392937g.mo120776m((String) null, C145313dl.f392726af) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase d = mo120806d();
            if (((long) d.update("apps", contentValues, "app_id = ?", new String[]{l})) == 0 && d.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f393011w.mo120965ar().f392795c.mo120895b("Failed to insert/update app (got -1). appId", C145325dx.m236116a(l));
            }
        } catch (SQLiteException e) {
            this.f393011w.mo120965ar().f392795c.mo120896c("Error storing app. appId", C145325dx.m236116a(l), e);
        }
    }

    /* renamed from: y */
    public final void mo120826y(C145234an anVar) {
        C143919bh.m233958a(anVar);
        mo120904g();
        mo121194J();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", anVar.f392596a);
        contentValues.put("name", anVar.f392597b);
        contentValues.put("lifetime_count", Long.valueOf(anVar.f392598c));
        contentValues.put("current_bundle_count", Long.valueOf(anVar.f392599d));
        contentValues.put("last_fire_timestamp", Long.valueOf(anVar.f392601f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(anVar.f392602g));
        contentValues.put("last_bundled_day", anVar.f392603h);
        contentValues.put("last_sampled_complex_event_id", anVar.f392604i);
        contentValues.put("last_sampling_rate", anVar.f392605j);
        contentValues.put("current_session_count", Long.valueOf(anVar.f392600e));
        Boolean bool = anVar.f392606k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (mo120806d().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.f393011w.mo120965ar().f392795c.mo120895b("Failed to insert/update event aggregates (got -1). appId", C145325dx.m236116a(anVar.f392596a));
            }
        } catch (SQLiteException e) {
            this.f393011w.mo120965ar().f392795c.mo120896c("Error storing event aggregates. appId", C145325dx.m236116a(anVar.f392596a), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo120827z() {
        C145361ff ffVar = this.f393011w;
        Context context = ffVar.f392931a;
        C145222ab abVar = ffVar.f392937g;
        return context.getDatabasePath("google_app_measurement.db").exists();
    }
}

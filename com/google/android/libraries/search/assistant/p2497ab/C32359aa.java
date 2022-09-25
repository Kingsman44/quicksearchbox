package com.google.android.libraries.search.assistant.p2497ab;

import android.database.Cursor;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1989l.p1990a.p1991a.p1992a.C24063a;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.ab.aa */
/* compiled from: PG */
public final class C32359aa implements C32409d {

    /* renamed from: a */
    public static final C59071e f86743a = C59071e.m91332i("com.google.android.libraries.search.assistant.ab.aa");

    /* renamed from: b */
    public static final Duration f86744b = Duration.ofDays(90);

    /* renamed from: c */
    public static final double f86745c = Math.log(4194304.0d);

    /* renamed from: d */
    public static final String[] f86746d = {"number", "normalized_number", "type", "date", "duration"};

    /* renamed from: e */
    public static final String[] f86747e = {"address", "type", "date", "body"};

    /* renamed from: f */
    public static final double[] f86748f = {1.0d, 0.9501d, 0.90269d, 0.857646d, 0.814849d, 0.774188d, 0.735556d, 0.698852d, 0.663979d, 0.630847d, 0.599367d, 0.569459d, 0.541043d, 0.514045d, 0.488394d, 0.464023d, 0.440869d, 0.418869d, 0.397968d, 0.378109d, 0.359241d, 0.341315d, 0.324284d, 0.308102d, 0.292728d, 0.27812d, 0.264242d, 0.251057d, 0.238529d, 0.226626d, 0.215318d, 0.204573d, 0.194365d, 0.184666d, 0.175451d, 0.166696d, 0.158378d, 0.150475d, 0.142966d, 0.135832d, 0.129054d, 0.122615d, 0.116496d, 0.110683d, 0.10516d, 0.099912d, 0.094927d, 0.09019d, 0.085689d, 0.081414d, 0.077351d, 0.073491d, 0.069824d, 0.06634d, 0.063029d, 0.059884d, 0.056896d, 0.054057d, 0.051359d, 0.048797d, 0.046362d, 0.044048d, 0.04185d, 0.039762d, 0.037778d, 0.035893d, 0.034102d, 0.0324d, 0.030783d, 0.029247d, 0.027788d, 0.026401d, 0.025084d, 0.023832d, 0.022643d, 0.021513d, 0.020439d, 0.019419d, 0.01845d, 0.01753d, 0.016655d, 0.015824d, 0.015034d, 0.014284d, 0.013571d, 0.012894d, 0.012251d, 0.011639d, 0.011059d, 0.010507d, 0.009982d, 0.009484d, 0.009011d, 0.008561d, 0.008134d, 0.007728d, 0.007343d, 0.006976d, 0.006628d, 0.006297d};

    /* renamed from: g */
    public final C21370a f86749g;

    /* renamed from: h */
    public final C46877q f86750h;

    /* renamed from: i */
    public final Executor f86751i;

    public C32359aa(C21370a aVar, C46877q qVar, Executor executor) {
        this.f86749g = aVar;
        this.f86750h = qVar;
        this.f86751i = executor;
    }

    /* renamed from: a */
    public static C32361ac m60168a(C32365ag agVar, String str) {
        String str2 = agVar.f86766g;
        String str3 = agVar.f86765f;
        C32360ab abVar = (C32360ab) C32361ac.f86752d.createBuilder();
        abVar.copyOnWrite();
        C32361ac acVar = (C32361ac) abVar.instance;
        acVar.f86754a |= 1;
        acVar.f86755b = false;
        if (TextUtils.isEmpty(str3)) {
            abVar.copyOnWrite();
            C32361ac acVar2 = (C32361ac) abVar.instance;
            acVar2.f86756c = 5;
            acVar2.f86754a |= 2;
        } else if (C24063a.m44681b(str3)) {
            abVar.copyOnWrite();
            C32361ac acVar3 = (C32361ac) abVar.instance;
            acVar3.f86756c = 1;
            acVar3.f86754a |= 2;
            if (str.equals(str2)) {
                abVar.copyOnWrite();
                C32361ac acVar4 = (C32361ac) abVar.instance;
                acVar4.f86754a |= 1;
                acVar4.f86755b = true;
            }
        } else if (C24063a.m44680a(str3)) {
            abVar.copyOnWrite();
            C32361ac acVar5 = (C32361ac) abVar.instance;
            acVar5.f86756c = 2;
            acVar5.f86754a |= 2;
        } else if (C24063a.f65743a.contains(str3)) {
            abVar.copyOnWrite();
            C32361ac acVar6 = (C32361ac) abVar.instance;
            acVar6.f86756c = 3;
            acVar6.f86754a |= 2;
        } else {
            abVar.copyOnWrite();
            C32361ac acVar7 = (C32361ac) abVar.instance;
            acVar7.f86756c = 6;
            acVar7.f86754a |= 2;
        }
        return (C32361ac) abVar.build();
    }

    /* renamed from: b */
    public static C32369ak m60169b(C60870cx cxVar) {
        try {
            return (C32369ak) C60856cj.m92909r(cxVar);
        } catch (ExecutionException unused) {
            ((C59052c) ((C59052c) f86743a.mo56224b()).mo56372aa(52601)).mo56386p("Unable to get RawTopContactResponse.");
            return C32369ak.f86776c;
        }
    }

    /* renamed from: c */
    public static Optional m60170c(Cursor cursor, String str) {
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (cursor.isNull(columnIndex)) {
                return Optional.empty();
            }
            return Optional.m71637of(Long.valueOf(cursor.getLong(columnIndex)));
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f86743a.mo56226d()).mo56382g(e)).mo56372aa(52615)).mo56389s("Exception in getLong from column: %s", str);
            return Optional.empty();
        }
    }

    /* renamed from: d */
    public static String m60171d(Cursor cursor, String str) {
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (cursor.isNull(columnIndex)) {
                return BuildConfig.FLAVOR;
            }
            return C58837ba.m90858g(cursor.getString(columnIndex));
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f86743a.mo56226d()).mo56382g(e)).mo56372aa(52617)).mo56389s("Exception in getString from column: %s", str);
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: e */
    public static Optional m60172e(Cursor cursor) {
        try {
            int columnIndex = cursor.getColumnIndex("type");
            if (cursor.isNull(columnIndex)) {
                return Optional.empty();
            }
            return Optional.m71637of(Integer.valueOf(cursor.getInt(columnIndex)));
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f86743a.mo56226d()).mo56382g(e)).mo56372aa(52613)).mo56389s("Exception in getString from column: %s", "type");
            return Optional.empty();
        }
    }
}

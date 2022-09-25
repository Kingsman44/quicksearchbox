package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.p10782e.C143873c;
import com.google.android.gms.common.util.C144006f;
import com.google.android.gms.measurement.api.internal.C145198g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p3186j$.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.ke */
/* compiled from: PG */
public final class C145495ke extends C145381fz {

    /* renamed from: a */
    public static final String[] f393386a = {"_err"};

    /* renamed from: b */
    private static final String[] f393387b = {"firebase_", "google_", "ga_"};

    /* renamed from: c */
    private SecureRandom f393388c;

    /* renamed from: d */
    private final AtomicLong f393389d = new AtomicLong(0);

    /* renamed from: e */
    private int f393390e;

    /* renamed from: f */
    private Integer f393391f = null;

    public C145495ke(C145361ff ffVar) {
        super(ffVar);
    }

    /* renamed from: B */
    static MessageDigest m236482B() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: D */
    public static ArrayList m236483D(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ConditionalUserPropertyParcel conditionalUserPropertyParcel = (ConditionalUserPropertyParcel) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", conditionalUserPropertyParcel.f392524a);
            bundle.putString("origin", conditionalUserPropertyParcel.f392525b);
            bundle.putLong("creation_timestamp", conditionalUserPropertyParcel.f392527d);
            bundle.putString("name", conditionalUserPropertyParcel.f392526c.f392541b);
            Object a = conditionalUserPropertyParcel.f392526c.mo120761a();
            C143919bh.m233958a(a);
            C145384gb.m236289b(bundle, a);
            bundle.putBoolean("active", conditionalUserPropertyParcel.f392528e);
            String str = conditionalUserPropertyParcel.f392529f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            EventParcel eventParcel = conditionalUserPropertyParcel.f392530g;
            if (eventParcel != null) {
                bundle.putString("timed_out_event_name", eventParcel.f392536a);
                EventParams eventParams = eventParcel.f392537b;
                if (eventParams != null) {
                    bundle.putBundle("timed_out_event_params", eventParams.mo120754a());
                }
            }
            bundle.putLong("trigger_timeout", conditionalUserPropertyParcel.f392531h);
            EventParcel eventParcel2 = conditionalUserPropertyParcel.f392532i;
            if (eventParcel2 != null) {
                bundle.putString("triggered_event_name", eventParcel2.f392536a);
                EventParams eventParams2 = eventParcel2.f392537b;
                if (eventParams2 != null) {
                    bundle.putBundle("triggered_event_params", eventParams2.mo120754a());
                }
            }
            bundle.putLong("triggered_timestamp", conditionalUserPropertyParcel.f392526c.f392542c);
            bundle.putLong("time_to_live", conditionalUserPropertyParcel.f392533j);
            EventParcel eventParcel3 = conditionalUserPropertyParcel.f392534k;
            if (eventParcel3 != null) {
                bundle.putString("expired_event_name", eventParcel3.f392536a);
                EventParams eventParams3 = eventParcel3.f392537b;
                if (eventParams3 != null) {
                    bundle.putBundle("expired_event_params", eventParams3.mo120754a());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: F */
    public static void m236484F(C145423hn hnVar, Bundle bundle, boolean z) {
        if (!(bundle == null || hnVar == null)) {
            if (!bundle.containsKey("_sc") || z) {
                String str = hnVar.f393162a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = hnVar.f393163b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", hnVar.f393164c);
                return;
            }
            z = false;
        }
        if (bundle != null && hnVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: ad */
    static boolean m236485ad(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: ae */
    static boolean m236486ae(String str) {
        C143919bh.m233969l(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* renamed from: af */
    static boolean m236487af(Context context) {
        ActivityInfo receiverInfo;
        C143919bh.m233958a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: aj */
    static final boolean m236488aj(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: am */
    static boolean m236489am(Context context) {
        C143919bh.m233958a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0);
                if (serviceInfo == null || !serviceInfo.enabled) {
                    return false;
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: an */
    static final boolean m236490an(String str) {
        C143919bh.m233958a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: ao */
    private final int m236491ao(String str) {
        if ("_ldl".equals(str)) {
            C145222ab abVar = this.f393011w.f392937g;
            return 2048;
        } else if ("_id".equals(str)) {
            C145222ab abVar2 = this.f393011w.f392937g;
            return 256;
        } else if ("_lgclid".equals(str)) {
            C145222ab abVar3 = this.f393011w.f392937g;
            return 100;
        } else {
            C145222ab abVar4 = this.f393011w.f392937g;
            return 36;
        }
    }

    /* renamed from: ap */
    private final Object m236492ap(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return mo121293z(obj.toString(), i, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle u = mo121288u((Bundle) parcelable);
                    if (!u.isEmpty()) {
                        arrayList.add(u);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: aq */
    private static boolean m236493aq(String str, String[] strArr) {
        for (String equals : strArr) {
            if (Objects.equals(str, equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    static long m236494q(byte[] bArr) {
        C143919bh.m233958a(bArr);
        int length = bArr.length;
        int i = 0;
        C143919bh.m233966i(length > 0);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    /* renamed from: A */
    public final URL mo121248A(long j, String str, String str2, long j2) {
        try {
            C143919bh.m233969l(str2);
            C143919bh.m233969l(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{74009L, Integer.valueOf(mo121284p())}), str2, str, Long.valueOf(j2)});
            if (str.equals(this.f393011w.f392937g.mo120782u("debug.deferred.deeplink"))) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f393011w.mo120965ar().f392795c.mo120895b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final SecureRandom mo121249C() {
        mo120904g();
        if (this.f393388c == null) {
            this.f393388c = new SecureRandom();
        }
        return this.f393388c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo121250E(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f393011w.mo120965ar().f392798f.mo120895b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo121251G(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    this.f393011w.mo120977o().mo121254K(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo121252H(C145326dy dyVar, int i) {
        int i2 = 0;
        for (String str : new TreeSet(dyVar.f392808d.keySet())) {
            if (m236486ae(str) && (i2 = i2 + 1) > i) {
                this.f393011w.mo120965ar().f392797e.mo120896c("Event can't contain more than " + i + " params", this.f393011w.f392942l.mo120890c(dyVar.f392805a), this.f393011w.f392942l.mo120889b(dyVar.f392808d));
                m236488aj(dyVar.f392808d, 5);
                dyVar.f392808d.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo121253J(C145494kd kdVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m236488aj(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        kdVar.mo121066a(str, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo121254K(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                this.f393011w.mo120965ar().f392800h.mo120896c("Not putting event parameter. Invalid value type. name, type", this.f393011w.f392942l.mo120891d(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* renamed from: L */
    public final void mo121255L(C145198g gVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(C33259r.f88929b, z);
        try {
            gVar.mo120689c(bundle);
        } catch (RemoteException e) {
            this.f393011w.mo120965ar().f392798f.mo120895b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: M */
    public final void mo121256M(C145198g gVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(C33259r.f88929b, arrayList);
        try {
            gVar.mo120689c(bundle);
        } catch (RemoteException e) {
            this.f393011w.mo120965ar().f392798f.mo120895b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: N */
    public final void mo121257N(C145198g gVar, Bundle bundle) {
        try {
            gVar.mo120689c(bundle);
        } catch (RemoteException e) {
            this.f393011w.mo120965ar().f392798f.mo120895b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: O */
    public final void mo121258O(C145198g gVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(C33259r.f88929b, bArr);
        try {
            gVar.mo120689c(bundle);
        } catch (RemoteException e) {
            this.f393011w.mo120965ar().f392798f.mo120895b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: P */
    public final void mo121259P(C145198g gVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(C33259r.f88929b, i);
        try {
            gVar.mo120689c(bundle);
        } catch (RemoteException e) {
            this.f393011w.mo120965ar().f392798f.mo120895b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: Q */
    public final void mo121260Q(C145198g gVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong(C33259r.f88929b, j);
        try {
            gVar.mo120689c(bundle);
        } catch (RemoteException e) {
            this.f393011w.mo120965ar().f392798f.mo120895b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: R */
    public final void mo121261R(C145198g gVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(C33259r.f88929b, str);
        try {
            gVar.mo120689c(bundle);
        } catch (RemoteException e) {
            this.f393011w.mo120965ar().f392798f.mo120895b("Error returning string value to wrapper", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo121262S(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        String str4;
        int i2;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            C145222ab abVar = this.f393011w.f392937g;
            int i3 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str6)) {
                    i = !z ? mo121282j(str6) : 0;
                    if (i == 0) {
                        i = mo121281i(str6);
                    }
                } else {
                    i = 0;
                }
                if (i != 0) {
                    mo121276ai(bundle2, i, str6, i == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (mo121272ab(bundle2.get(str6))) {
                        this.f393011w.mo120965ar().f392800h.mo120897d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        i2 = 22;
                        str4 = str6;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i2 = mo121270a(str, str2, str6, bundle2.get(str6), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        mo121276ai(bundle2, i2, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (m236486ae(str4) && !m236493aq(str4, C145386gd.f393051d) && (i3 = i3 + 1) > 0) {
                        this.f393011w.mo120965ar().f392797e.mo120896c("Item cannot contain custom parameters", this.f393011w.f392942l.mo120890c(str5), this.f393011w.f392942l.mo120889b(bundle2));
                        m236488aj(bundle2, 23);
                        bundle2.remove(str4);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final boolean mo121263T(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m236490an(str)) {
                return true;
            }
            if (TextUtils.isEmpty(this.f393011w.f392932b)) {
                this.f393011w.mo120965ar().f392797e.mo120895b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C145325dx.m236116a(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(this.f393011w.f392932b)) {
                this.f393011w.mo120965ar().f392797e.mo120894a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (m236490an(str2)) {
            return true;
        } else {
            this.f393011w.mo120965ar().f392797e.mo120895b("Invalid admob_app_id. Analytics disabled.", C145325dx.m236116a(str2));
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final boolean mo121264U(String str, int i, String str2) {
        if (str2 == null) {
            this.f393011w.mo120965ar().f392797e.mo120895b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            this.f393011w.mo120965ar().f392797e.mo120897d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final boolean mo121265V(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f393011w.mo120965ar().f392797e.mo120895b("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = f393387b;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f393011w.mo120965ar().f392797e.mo120896c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m236493aq(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m236493aq(str2, strArr2)) {
            return true;
        }
        this.f393011w.mo120965ar().f392797e.mo120896c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final boolean mo121266W(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.f393011w.mo120965ar().f392800h.mo120897d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final boolean mo121267X(String str, String str2) {
        if (str2 == null) {
            this.f393011w.mo120965ar().f392797e.mo120895b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f393011w.mo120965ar().f392797e.mo120895b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f393011w.mo120965ar().f392797e.mo120896c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f393011w.mo120965ar().f392797e.mo120896c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final boolean mo121268Y(String str, String str2) {
        if (str2 == null) {
            this.f393011w.mo120965ar().f392797e.mo120895b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f393011w.mo120965ar().f392797e.mo120895b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f393011w.mo120965ar().f392797e.mo120896c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f393011w.mo120965ar().f392797e.mo120896c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public final boolean mo121269Z(String str) {
        mo120904g();
        if (C143873c.f389983a.mo119351a(this.f393011w.f392931a).f389982a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.f393011w.mo120965ar().f392802j.mo120895b("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo121270a(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r0 = r17
            r1 = r18
            r13.mo120904g()
            boolean r2 = r13.mo121272ab(r0)
            java.lang.String r3 = "param"
            r4 = 0
            if (r2 == 0) goto L_0x00a9
            if (r21 == 0) goto L_0x00a6
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.C145386gd.f393050c
            boolean r2 = m236493aq(r8, r2)
            if (r2 != 0) goto L_0x0020
            r0 = 20
            return r0
        L_0x0020:
            com.google.android.gms.measurement.internal.ff r2 = r7.f393011w
            com.google.android.gms.measurement.internal.it r2 = r2.mo120975m()
            r2.mo120904g()
            r2.mo120949a()
            boolean r5 = r2.mo121167w()
            if (r5 != 0) goto L_0x0033
            goto L_0x0045
        L_0x0033:
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w
            com.google.android.gms.measurement.internal.ke r2 = r2.mo120977o()
            int r2 = r2.mo121284p()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r5) goto L_0x0045
            r0 = 25
            return r0
        L_0x0045:
            com.google.android.gms.measurement.internal.ff r2 = r7.f393011w
            com.google.android.gms.measurement.internal.ab r2 = r2.f392937g
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0052
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x005d
        L_0x0052:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x00a9
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x005d:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L_0x00a9
            com.google.android.gms.measurement.internal.ff r9 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r9 = r9.mo120965ar()
            com.google.android.gms.measurement.internal.dv r9 = r9.f392800h
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.mo120897d(r10, r3, r8, r5)
            com.google.android.gms.measurement.internal.ff r5 = r7.f393011w
            com.google.android.gms.measurement.internal.ab r5 = r5.f392937g
            r5 = 17
            if (r2 == 0) goto L_0x008a
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r9 = r2.length
            if (r9 <= r6) goto L_0x00a3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a3
        L_0x008a:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a3
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r9 = r2.size()
            if (r9 <= r6) goto L_0x00a3
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r6)
            r9.<init>(r2)
            r1.putParcelableArrayList(r8, r9)
        L_0x00a3:
            r9 = 17
            goto L_0x00aa
        L_0x00a6:
            r0 = 21
            return r0
        L_0x00a9:
            r9 = 0
        L_0x00aa:
            boolean r1 = m236485ad(r15)
            if (r1 != 0) goto L_0x00be
            boolean r1 = m236485ad(r16)
            if (r1 == 0) goto L_0x00b7
            goto L_0x00be
        L_0x00b7:
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ab r1 = r1.f392937g
            r1 = 100
            goto L_0x00c4
        L_0x00be:
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ab r1 = r1.f392937g
            r1 = 256(0x100, float:3.59E-43)
        L_0x00c4:
            boolean r1 = r13.mo121266W(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00cb
            return r9
        L_0x00cb:
            if (r21 == 0) goto L_0x0157
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e2
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo121262S(r1, r2, r3, r4, r5, r6)
            goto L_0x0156
        L_0x00e2:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0117
            r10 = r0
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r11 = r10.length
            r12 = 0
        L_0x00eb:
            if (r12 >= r11) goto L_0x0156
            r0 = r10[r12]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0105
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392800h
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            java.lang.Class r0 = r0.getClass()
            r1.mo120896c(r2, r0, r8)
            goto L_0x0157
        L_0x0105:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo121262S(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x00eb
        L_0x0117:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0157
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r11 = r10.size()
            r12 = 0
        L_0x0123:
            if (r12 >= r11) goto L_0x0156
            java.lang.Object r0 = r10.get(r12)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0144
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392800h
            if (r0 == 0) goto L_0x013c
            java.lang.Class r0 = r0.getClass()
            goto L_0x013e
        L_0x013c:
            java.lang.String r0 = "null"
        L_0x013e:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.mo120896c(r2, r0, r8)
            goto L_0x0157
        L_0x0144:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo121262S(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x0123
        L_0x0156:
            return r9
        L_0x0157:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145495ke.mo121270a(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aa */
    public final boolean mo121271aa(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u = this.f393011w.f392937g.mo120782u("debug.firebase.analytics.app");
        C145508x xVar = this.f393011w.f392936f;
        return u.equals(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ab */
    public final boolean mo121272ab(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ac */
    public final boolean mo121273ac(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = C143873c.f389983a.mo119351a(context).mo119348b(str, 64);
            if (b == null || b.signatures == null || b.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            this.f393011w.mo120965ar().f392795c.mo120895b("Error obtaining certificate", e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            this.f393011w.mo120965ar().f392795c.mo120895b("Package name not found", e2);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ag */
    public final boolean mo121274ag(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C143919bh.m233958a(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ah */
    public final byte[] mo121275ah(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ai */
    public final void mo121276ai(Bundle bundle, int i, String str, Object obj) {
        if (m236488aj(bundle, i)) {
            C145222ab abVar = this.f393011w.f392937g;
            bundle.putString("_ev", mo121293z(str, 40, true));
            if (obj == null) {
                return;
            }
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", (long) obj.toString().length());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ak */
    public final EventParcel mo121277ak(String str, String str2, Bundle bundle, String str3, long j, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo121280d(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            Bundle v = mo121289v(str, str2, bundle2, Collections.singletonList("_o"), true);
            if (z) {
                v = mo121288u(v);
            }
            C143919bh.m233958a(v);
            return new EventParcel(str2, new EventParams(v), str3, j);
        }
        this.f393011w.mo120965ar().f392795c.mo120895b("Invalid conditional property event name", this.f393011w.f392942l.mo120892e(str2));
        throw new IllegalArgumentException();
    }

    /* renamed from: al */
    public final int mo121278al() {
        return C143876h.f389991d.mo119362j(this.f393011w.f392931a, 12451000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public final void mo120922at() {
        mo120904g();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f393011w.mo120965ar().f392798f.mo120894a("Utils falling back to Random for random id");
            }
        }
        this.f393389d.set(nextLong);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo120834b() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo121279c(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = mo121266W("user property referrer", str, m236491ao(str), obj);
        } else {
            z = mo121266W("user property", str, m236491ao(str), obj);
        }
        return z ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo121280d(String str) {
        if (!mo121267X("event", str)) {
            return 2;
        }
        if (!mo121265V("event", C145385gc.f393044a, C145385gc.f393045b, str)) {
            return 13;
        }
        C145222ab abVar = this.f393011w.f392937g;
        if (!mo121264U("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo121281i(String str) {
        if (!mo121267X("event param", str)) {
            return 3;
        }
        if (!mo121265V("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        C145222ab abVar = this.f393011w.f392937g;
        if (!mo121264U("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo121282j(String str) {
        if (!mo121268Y("event param", str)) {
            return 3;
        }
        if (!mo121265V("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        C145222ab abVar = this.f393011w.f392937g;
        if (!mo121264U("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final int mo121283o(String str) {
        if (!mo121267X("user property", str)) {
            return 6;
        }
        if (!mo121265V("user property", C145387ge.f393052a, (String[]) null, str)) {
            return 15;
        }
        C145222ab abVar = this.f393011w.f392937g;
        if (!mo121264U("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* renamed from: p */
    public final int mo121284p() {
        if (this.f393391f == null) {
            int i = C143876h.f389990c;
            this.f393391f = Integer.valueOf(C143700ab.m233439a(this.f393011w.f392931a) / 1000);
        }
        return this.f393391f.intValue();
    }

    /* renamed from: r */
    public final long mo121285r() {
        long andIncrement;
        long j;
        if (this.f393389d.get() == 0) {
            synchronized (this.f393389d) {
                long nanoTime = System.nanoTime();
                C144006f fVar = this.f393011w.f392924A;
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i = this.f393390e + 1;
                this.f393390e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f393389d) {
            this.f393389d.compareAndSet(-1, 1);
            andIncrement = this.f393389d.getAndIncrement();
        }
        return andIncrement;
    }

    /* renamed from: s */
    public final long mo121286s(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Bundle mo121287t(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str7 = uri.getQueryParameter("utm_campaign");
                    str6 = uri.getQueryParameter("utm_source");
                    str5 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str3 = uri.getQueryParameter("utm_id");
                    str2 = uri.getQueryParameter("dclid");
                    str = uri.getQueryParameter("srsltid");
                } else {
                    str7 = null;
                    str6 = null;
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("campaign", str7);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("source", str6);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("medium", str5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("campaign_id", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("dclid", str2);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("srsltid", str);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.f393011w.mo120965ar().f392798f.mo120895b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final Bundle mo121288u(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object w = mo121290w(str, bundle.get(str));
                if (w == null) {
                    this.f393011w.mo120965ar().f392800h.mo120895b("Param value can't be null", this.f393011w.f392942l.mo120891d(str));
                } else {
                    mo121254K(bundle2, str, w);
                }
            }
        }
        return bundle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo121289v(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List r23, boolean r24) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.C145385gc.f393047d
            boolean r13 = m236493aq(r10, r0)
            if (r11 == 0) goto L_0x00ec
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.ff r0 = r9.f393011w
            com.google.android.gms.measurement.internal.ab r0 = r0.f392937g
            int r8 = r0.mo120766b()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
        L_0x002e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0046
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r0 = 0
            goto L_0x0054
        L_0x0046:
            if (r24 != 0) goto L_0x004d
            int r0 = r9.mo121282j(r7)
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r0 != 0) goto L_0x0054
            int r0 = r9.mo121281i(r7)
        L_0x0054:
            if (r0 == 0) goto L_0x0065
            r1 = 3
            if (r0 != r1) goto L_0x005b
            r1 = r7
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            r9.mo121276ai(r15, r0, r7, r1)
            r15.remove(r7)
            r12 = r8
            goto L_0x00e5
        L_0x0065:
            java.lang.Object r4 = r11.get(r7)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r7
            r5 = r15
            r6 = r23
            r14 = r7
            r7 = r24
            r12 = r8
            r8 = r13
            int r0 = r0.mo121270a(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L_0x0088
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            r9.mo121276ai(r15, r1, r14, r0)
            goto L_0x00a4
        L_0x0088:
            if (r0 == 0) goto L_0x00a4
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x00a4
            r1 = 21
            if (r0 != r1) goto L_0x0098
            r7 = r10
            goto L_0x0099
        L_0x0098:
            r7 = r14
        L_0x0099:
            java.lang.Object r1 = r11.get(r14)
            r9.mo121276ai(r15, r0, r7, r1)
            r15.remove(r14)
            goto L_0x00e5
        L_0x00a4:
            boolean r0 = m236486ae(r14)
            if (r0 == 0) goto L_0x00e5
            int r0 = r18 + 1
            if (r0 <= r12) goto L_0x00e3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Event can't contain more than "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.ff r2 = r9.f393011w
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392797e
            com.google.android.gms.measurement.internal.ff r3 = r9.f393011w
            com.google.android.gms.measurement.internal.ds r3 = r3.f392942l
            java.lang.String r3 = r3.mo120890c(r10)
            com.google.android.gms.measurement.internal.ff r4 = r9.f393011w
            com.google.android.gms.measurement.internal.ds r4 = r4.f392942l
            java.lang.String r4 = r4.mo120889b(r11)
            r2.mo120896c(r1, r3, r4)
            r1 = 5
            m236488aj(r15, r1)
            r15.remove(r14)
        L_0x00e3:
            r18 = r0
        L_0x00e5:
            r8 = r12
            r12 = r23
            goto L_0x002e
        L_0x00ea:
            r14 = r15
            goto L_0x00ed
        L_0x00ec:
            r14 = 0
        L_0x00ed:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145495ke.mo121289v(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final Object mo121290w(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            C145222ab abVar = this.f393011w.f392937g;
            return m236492ap(256, obj, true, true);
        }
        if (m236485ad(str)) {
            C145222ab abVar2 = this.f393011w.f392937g;
        } else {
            C145222ab abVar3 = this.f393011w.f392937g;
            i = 100;
        }
        return m236492ap(i, obj, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final Object mo121291x(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m236492ap(m236491ao(str), obj, true, false);
        }
        return m236492ap(m236491ao(str), obj, false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final String mo121292y() {
        byte[] bArr = new byte[16];
        mo121249C().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* renamed from: z */
    public final String mo121293z(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }
}

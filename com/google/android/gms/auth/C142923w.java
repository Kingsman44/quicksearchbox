package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.p060c.C0979i;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.auth.p10743b.p10744a.C142889c;
import com.google.android.gms.auth.p10743b.p10744a.C142890d;
import com.google.android.gms.auth.p10743b.p10744a.C142892f;
import com.google.android.gms.auth.p10743b.p10744a.C142896j;
import com.google.android.gms.auth.p10743b.p10744a.C142897k;
import com.google.android.gms.auth.p10743b.p10744a.C142899m;
import com.google.android.gms.auth.p10743b.p10744a.C142900n;
import com.google.android.gms.common.internal.C143919bh;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.auth.w */
/* compiled from: PG */
public final class C142923w {

    /* renamed from: a */
    private final C142920t f387826a;

    /* renamed from: b */
    private final Context f387827b;

    public C142923w(Context context) {
        this(context, new C142922v());
    }

    public C142923w(Context context, C142920t tVar) {
        this.f387827b = context;
        this.f387826a = tVar;
    }

    /* renamed from: a */
    static String m231878a(String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                URL url = new URL(str);
                String protocol = url.getProtocol();
                String host = url.getHost();
                builder.appendQueryParameter("url", protocol + "://" + host);
                i++;
            } catch (MalformedURLException unused) {
                throw new IllegalArgumentException("Invalid URL: ".concat(String.valueOf(str)));
            }
        }
        return "weblogin:".concat(String.valueOf(builder.build().getQuery()));
    }

    /* renamed from: c */
    private final Set m231879c(List list) {
        Set set;
        Iterator it;
        Long l;
        String str;
        Set set2;
        int size = list.size();
        if (size == 0) {
            set = new C0979i(0);
        } else {
            if (size <= 128) {
                set2 = new C0979i(size);
            } else {
                set2 = new HashSet(size, 0.75f);
            }
            set = set2;
        }
        for (Iterator it2 = list.iterator(); it2.hasNext(); it2 = it) {
            C142890d dVar = (C142890d) it2.next();
            String str2 = !dVar.f387710e.isEmpty() ? dVar.f387710e : dVar.f387709d;
            if (TextUtils.isEmpty(str2) || dVar.f387707b.isEmpty() || dVar.f387708c.isEmpty()) {
                it = it2;
                Log.w("WebLoginHelper", "Invalid cookie.");
            } else {
                String str3 = null;
                Boolean valueOf = (dVar.f387706a & 32) != 0 ? Boolean.valueOf(dVar.f387712g) : null;
                C143919bh.m233969l(str2);
                boolean z = true;
                String str4 = (true != C142886b.m231838a(valueOf) ? "http" : "https") + "://" + str2;
                String str5 = dVar.f387707b;
                String str6 = dVar.f387708c;
                String str7 = dVar.f387709d;
                String str8 = dVar.f387711f;
                int i = dVar.f387706a;
                Boolean valueOf2 = (i & 64) != 0 ? Boolean.valueOf(dVar.f387713h) : null;
                Boolean valueOf3 = (i & 32) != 0 ? Boolean.valueOf(dVar.f387712g) : null;
                if ((i & 128) != 0) {
                    it = it2;
                    l = Long.valueOf((long) dVar.f387714i);
                } else {
                    it = it2;
                    l = null;
                }
                if ((i & 256) != 0) {
                    int a = C142889c.m231839a(dVar.f387715j);
                    str = (a == 0 || a == 1) ? "UNKNOWN_PRIORITY" : a != 2 ? a != 3 ? "HIGH" : "MEDIUM" : "LOW";
                } else {
                    str = null;
                }
                if ((i & 512) != 0) {
                    str3 = dVar.f387716k;
                }
                if ((i & 1024) == 0 || dVar.f387717l.isEmpty()) {
                    z = false;
                }
                Boolean valueOf4 = Boolean.valueOf(z);
                if (str5 == null) {
                    str5 = BuildConfig.FLAVOR;
                }
                StringBuilder sb = new StringBuilder(str5);
                sb.append('=');
                if (!TextUtils.isEmpty(str6)) {
                    sb.append(str6);
                }
                if (C142886b.m231838a(valueOf2)) {
                    sb.append(";HttpOnly");
                }
                if (C142886b.m231838a(valueOf3)) {
                    sb.append(";Secure");
                }
                if (!TextUtils.isEmpty(str7)) {
                    sb.append(";Domain=");
                    sb.append(str7);
                }
                if (!TextUtils.isEmpty(str8)) {
                    sb.append(";Path=");
                    sb.append(str8);
                }
                if (l != null && l.longValue() > 0) {
                    sb.append(";Max-Age=");
                    sb.append(l);
                }
                if (!TextUtils.isEmpty(str)) {
                    sb.append(";Priority=");
                    sb.append(str);
                }
                if (!TextUtils.isEmpty(str3)) {
                    sb.append(";SameSite=");
                    sb.append(str3);
                }
                if (C142886b.m231838a(valueOf4)) {
                    sb.append(";SameParty");
                }
                String sb2 = sb.toString();
                Log.d("WebLoginHelper", "Setting cookie for url: ".concat(str4));
                this.f387826a.mo46995a(str4, sb2);
                set.add(str4);
            }
        }
        return set;
    }

    /* renamed from: b */
    public final Set mo117819b(Account account, String... strArr) {
        C143919bh.m233958a(account);
        try {
            C142892f fVar = (C142892f) C62942bv.parseFrom((C62942bv) C142892f.f387718c, Base64.decode(C142914n.m231859g(this.f387827b, account, m231878a(strArr)), 9), C62921ba.m95368a());
            if (fVar != null) {
                int i = 1;
                if ((fVar.f387720a & 1) != 0) {
                    C142900n nVar = fVar.f387721b;
                    if (nVar == null) {
                        nVar = C142900n.f387729d;
                    }
                    int a = C142899m.m231841a(nVar.f387731a);
                    if (a == 0) {
                        a = 1;
                    }
                    int i2 = a - 1;
                    if (i2 == 1) {
                        return m231879c(nVar.f387732b);
                    }
                    if (i2 == 2) {
                        throw new IOException("Request failed, but server said RETRY.");
                    } else if (i2 != 5) {
                        Log.w("WebLoginHelper", "Unexpected response: ".concat(String.valueOf(String.valueOf(nVar))));
                        int a2 = C142899m.m231841a(nVar.f387731a);
                        if (a2 != 0) {
                            i = a2;
                        }
                        StringBuilder sb = new StringBuilder("Unknown response status: ");
                        sb.append(i - 1);
                        throw new C142903e(sb.toString());
                    } else {
                        m231879c(nVar.f387732b);
                        for (C142897k kVar : nVar.f387733c) {
                            int i3 = kVar.f387725a;
                            int a3 = C142896j.m231840a(i3);
                            if (a3 == 0) {
                                a3 = 1;
                            }
                            int i4 = a3 - 1;
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    throw new C142921u(kVar.f387726b);
                                } else if (i4 != 3) {
                                    int a4 = C142896j.m231840a(i3);
                                    if (a4 == 0) {
                                        a4 = 1;
                                    }
                                    StringBuilder sb2 = new StringBuilder("Unrecognized failed account status: ");
                                    sb2.append(a4 - 1);
                                    Log.w("WebLoginHelper", sb2.toString());
                                }
                            }
                        }
                        throw new C142903e("Authorization failed, but no recoverable accounts.");
                    }
                }
            }
            throw new C142903e("Invalid response.");
        } catch (C62974ct e) {
            throw new C142903e("Couldn't read data from server.", e);
        }
    }
}

package com.google.android.libraries.storage.p3304a.p3305a;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.storage.p3304a.p3307c.C42764q;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42747h;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.storage.a.a.e */
/* compiled from: PG */
public final class C42718e {

    /* renamed from: a */
    public String f111966a;

    /* renamed from: b */
    public String f111967b = "files";

    /* renamed from: c */
    public String f111968c = "common";

    /* renamed from: d */
    public Account f111969d = C42719f.f111973a;

    /* renamed from: e */
    public final C58480gp f111970e = C58485gu.m89837e();

    /* renamed from: f */
    private final Context f111971f;

    /* renamed from: g */
    private String f111972g = BuildConfig.FLAVOR;

    public C42718e(Context context) {
        C42748i.m75526a(context != null, "Context cannot be null", new Object[0]);
        this.f111971f = context;
        this.f111966a = context.getPackageName();
    }

    /* renamed from: a */
    public final Uri mo45820a() {
        return new Uri.Builder().scheme("android").authority(this.f111966a).path("/" + this.f111967b + "/" + this.f111968c + "/" + C42714a.m75444b(this.f111969d) + "/" + this.f111972g).encodedFragment(C42747h.m75525b(this.f111970e.mo55394f())).build();
    }

    /* renamed from: b */
    public final void mo45821b(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        int i = C42719f.f111974b;
        this.f111972g = str;
    }

    /* renamed from: c */
    public final void mo45822c(String str, C42729p pVar) {
        String str2;
        File b = C42717d.m75457b(this.f111971f);
        String absolutePath = b.getAbsolutePath();
        String absolutePath2 = this.f111971f.getCacheDir().getAbsolutePath();
        String absolutePath3 = new File(b, "managed").getAbsolutePath();
        String str3 = null;
        File externalFilesDir = this.f111971f.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            str3 = externalFilesDir.getAbsolutePath();
        }
        File a = C42717d.m75456a(this.f111971f);
        String absolutePath4 = new File(a, "files").getAbsolutePath();
        String absolutePath5 = new File(a, "cache").getAbsolutePath();
        if (str.startsWith(absolutePath3)) {
            C42719f.m75462b("managed");
            this.f111967b = "managed";
            str2 = str.substring(absolutePath3.length());
        } else if (str.startsWith(absolutePath)) {
            C42719f.m75462b("files");
            this.f111967b = "files";
            str2 = str.substring(absolutePath.length());
        } else if (str.startsWith(absolutePath2)) {
            C42719f.m75462b("cache");
            this.f111967b = "cache";
            str2 = str.substring(absolutePath2.length());
        } else if (str3 != null && str.startsWith(str3)) {
            C42719f.m75462b("external");
            this.f111967b = "external";
            str2 = str.substring(str3.length());
        } else if (absolutePath4 != null && str.startsWith(absolutePath4)) {
            C42719f.m75462b("directboot-files");
            this.f111967b = "directboot-files";
            str2 = str.substring(absolutePath4.length());
        } else if (absolutePath5 == null || !str.startsWith(absolutePath5)) {
            throw new IllegalArgumentException("Path must be in app-private files dir or external files dir: ".concat(String.valueOf(str)));
        } else {
            C42719f.m75462b("directboot-cache");
            this.f111967b = "directboot-cache";
            str2 = str.substring(absolutePath5.length());
        }
        List asList = Arrays.asList(str2.split(File.separator));
        boolean z = true;
        C42748i.m75526a(asList.size() >= 3, "Path must be in module and account subdirectories: %s", str);
        String str4 = (String) asList.get(1);
        C42719f.m75463c(str4);
        this.f111968c = str4;
        String str5 = (String) asList.get(2);
        if (!"managed".equals(this.f111967b) || C42714a.m75445c(str5)) {
            Account a2 = C42714a.m75443a(str5);
            C42714a.m75444b(a2);
            this.f111969d = a2;
        } else {
            try {
                int parseInt = Integer.parseInt(str5);
                if (pVar == null) {
                    z = false;
                }
                C42748i.m75526a(z, "AccountManager cannot be null", new Object[0]);
                try {
                    Account account = (Account) pVar.mo45835a(parseInt).get();
                    C42714a.m75444b(account);
                    this.f111969d = account;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IllegalArgumentException(new C42764q((Throwable) e));
                } catch (ExecutionException e2) {
                    throw new IllegalArgumentException(new C42764q(e2.getCause()));
                }
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        mo45821b(str2.substring(this.f111968c.length() + str5.length() + 2));
    }
}

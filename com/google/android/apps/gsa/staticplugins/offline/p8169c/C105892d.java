package com.google.android.apps.gsa.staticplugins.offline.p8169c;

import android.content.Context;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59332o;
import com.google.common.p4541l.C59337t;
import com.google.p395al.p408c.p409a.p410a.C8443b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.c.d */
/* compiled from: PG */
public final class C105892d {

    /* renamed from: b */
    private static final C59071e f295536b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.offline.c.d");

    /* renamed from: c */
    private static final Pattern f295537c = Pattern.compile("string_factory_(\\w{2})_(\\w{2}).pb.bin$");

    /* renamed from: a */
    public C8443b f295538a;

    public C105892d(Context context, Locale locale) {
        String[] strArr;
        C58833ax axVar;
        C58833ax axVar2;
        String str;
        InputStream open;
        try {
            strArr = context.getAssets().list("string_factory");
        } catch (IOException e) {
            try {
                ((C59052c) ((C59052c) ((C59052c) f295536b.mo56225c()).mo56382g(e)).mo56372aa(22532)).mo56389s("Cannot retrieve asset folder for String Factory %s.", "string_factory");
                strArr = null;
            } catch (IOException e2) {
                throw new IOException(String.format("Cannot process target resource %s.\n%s", new Object[]{str, e2.getMessage()}), e2);
            } catch (IOException e3) {
                throw new C105891c("Asset file cannot be load properly. ".concat(String.valueOf(e3.getMessage())), e3);
            } catch (Throwable th) {
                C59337t.m92221a(open);
                throw th;
            }
        }
        C58838bb.m90867b(strArr, "Cannot retrieve asset folder %s for string factory.", "string_factory");
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ((C59052c) ((C59052c) f295536b.mo56225c()).mo56372aa(22529)).mo56389s("Cannot find desired asset file for locale %s.", locale.getLanguage());
                axVar = C58836b.f156633a;
                break;
            }
            String str2 = strArr[i];
            Matcher matcher = f295537c.matcher(str2);
            if (matcher.find() && matcher.group(1).equalsIgnoreCase(locale.getLanguage())) {
                axVar = C58833ax.m90834k("string_factory/".concat(String.valueOf(str2)));
                break;
            }
            i++;
        }
        if (!axVar.mo56113h()) {
            axVar2 = C58836b.f156633a;
        } else {
            str = (String) axVar.mo56107c();
            open = context.getAssets().open(str);
            byte[] d = C59332o.m92213d(open);
            int length2 = d.length;
            C58833ax k = C58833ax.m90834k((C8443b) C62942bv.parseFrom((C62942bv) C8443b.f29340b, d, C62921ba.m95368a()));
            C59337t.m92221a(open);
            axVar2 = k;
        }
        if (axVar2.mo56113h()) {
            this.f295538a = (C8443b) axVar2.mo56107c();
            return;
        }
        throw new C105891c("Cannot find request resource for locale ".concat(String.valueOf(locale.getLanguage())));
    }
}

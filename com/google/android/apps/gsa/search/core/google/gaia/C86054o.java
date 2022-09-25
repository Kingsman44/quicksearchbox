package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.apps.gsa.shared.p7009b.C89336a;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.o */
/* compiled from: PG */
public interface C86054o extends C92302a, C89336a {
    /* renamed from: a */
    Account mo79668a();

    /* renamed from: b */
    Uri mo79669b(Uri uri, String str);

    /* renamed from: c */
    C60870cx mo79670c(Account account, String str);

    /* renamed from: e */
    C60870cx mo79671e(String str, Account account, C91032p pVar);

    /* renamed from: f */
    C60870cx mo79672f(String str, Account account, boolean z, C91032p pVar);

    /* renamed from: g */
    String mo79673g();

    /* renamed from: h */
    String mo79674h(String str);

    /* renamed from: i */
    void mo79675i(C86051l lVar);

    /* renamed from: j */
    void mo79676j();

    /* renamed from: k */
    void mo79677k(Account account, Uri uri, String str, C91043j jVar);

    /* renamed from: l */
    void mo79678l(Collection collection);

    /* renamed from: m */
    void mo79679m();

    /* renamed from: n */
    void mo79680n();

    /* renamed from: o */
    void mo79681o(C86051l lVar);

    /* renamed from: p */
    boolean mo79682p();

    /* renamed from: q */
    boolean mo79683q();

    /* renamed from: r */
    Account[] mo79684r();

    /* renamed from: s */
    String[] mo79685s();

    /* renamed from: t */
    void mo79686t(String str);
}

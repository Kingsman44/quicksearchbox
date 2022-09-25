package com.google.android.libraries.p11026am;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.libraries.am.d */
/* compiled from: PG */
final class C147761d {

    /* renamed from: b */
    private static final C58974d f398706b = C58974d.m91134h("GlobMatcher");

    /* renamed from: a */
    public final Pattern f398707a;

    private C147761d(String str, Pattern pattern) {
        str.getClass();
        this.f398707a = pattern;
    }

    /* renamed from: a */
    public static C58833ax m240838a(String str) {
        C147760c cVar = new C147760c();
        StringBuilder sb = new StringBuilder();
        if (cVar.mo124437a(str.toCharArray(), sb, false)) {
            try {
                return C58833ax.m90834k(new C147761d(str, Pattern.compile(sb.toString(), 2)));
            } catch (PatternSyntaxException e) {
                ((C58970a) ((C58970a) ((C58970a) f398706b.mo56225c()).mo56382g(e)).mo56372aa(50537)).mo56389s("Internal error. Generated regex is invalid: %s", sb);
                return C58836b.f156633a;
            }
        } else {
            ((C58970a) ((C58970a) f398706b.mo56225c()).mo56372aa(50536)).mo56389s("Internal error. Can't parse glob-pattern: %s", str);
            return C58836b.f156633a;
        }
    }
}

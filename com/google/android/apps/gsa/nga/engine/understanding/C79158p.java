package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58565jt;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.p */
/* compiled from: PG */
public final class C79158p {

    /* renamed from: a */
    public static final C58528ij f217605a = new C58759qy("Create_alarm");

    /* renamed from: b */
    private static final C58528ij f217606b = C58528ij.m90012L("Send_digital_object", "Reply_to_message", "DictateToKeyboard");

    /* renamed from: c */
    private static final C58528ij f217607c = new C58759qy("Initiate_call");

    /* renamed from: d */
    private static final C58528ij f217608d = new C58759qy("Calculate_expression");

    /* renamed from: a */
    public static boolean m127100a(String str) {
        C79330v b = C79330v.m127277b(str);
        C58565jt jtVar = new C58565jt(((C58759qy) f217608d).f156534a);
        while (jtVar.hasNext()) {
            if (b.mo73901d((String) jtVar.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m127101b(String str) {
        C79330v b = C79330v.m127277b(str);
        C58565jt jtVar = new C58565jt(((C58759qy) f217607c).f156534a);
        while (jtVar.hasNext()) {
            if (b.mo73901d((String) jtVar.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m127102c(String str) {
        C79330v b = C79330v.m127277b(str);
        C58800sl lA = f217606b.iterator();
        while (lA.hasNext()) {
            if (b.mo73901d((String) lA.next())) {
                return true;
            }
        }
        return false;
    }
}

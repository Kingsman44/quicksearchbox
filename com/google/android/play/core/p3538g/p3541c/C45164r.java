package com.google.android.play.core.p3538g.p3541c;

import com.google.android.play.core.p3538g.p3539a.C45114a;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.play.core.g.c.r */
/* compiled from: PG */
public final /* synthetic */ class C45164r implements C45167u {

    /* renamed from: a */
    public final /* synthetic */ C45168v f117904a;

    public /* synthetic */ C45164r(C45168v vVar) {
        this.f117904a = vVar;
    }

    /* renamed from: a */
    public final void mo49008a() {
        C45168v vVar = this.f117904a;
        String str = null;
        String str2 = null;
        for (int i = 0; i < vVar.f117908a.getAttributeCount(); i++) {
            if ("module".equals(vVar.f117908a.getAttributeName(i))) {
                str = vVar.f117908a.getAttributeValue(i);
            }
            if ("errorCode".equals(vVar.f117908a.getAttributeName(i))) {
                str2 = vVar.f117908a.getAttributeValue(i);
            }
        }
        if (str == null || str2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", new Object[]{"split-install-error"}), vVar.f117908a, (Throwable) null);
        }
        vVar.f117909b.mo48980b().put(str, Integer.valueOf(C45114a.m80305a(str2)));
        do {
        } while (vVar.f117908a.next() != 3);
    }
}

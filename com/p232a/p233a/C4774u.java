package com.p232a.p233a;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

/* renamed from: com.a.a.u */
/* compiled from: PG */
public class C4774u extends C4713av implements C4711at {

    /* renamed from: a */
    public List f15120a = new ArrayList();

    /* renamed from: b */
    public Boolean f15121b;

    /* renamed from: c */
    public Matrix f15122c;

    /* renamed from: d */
    public String f15123d;

    /* renamed from: e */
    public int f15124e;

    protected C4774u() {
    }

    /* renamed from: b */
    public final void mo9601b(C4715ax axVar) {
        if (axVar instanceof C4705an) {
            this.f15120a.add(axVar);
            return;
        }
        String obj = axVar.toString();
        throw new SAXException("Gradient elements cannot contain " + obj + " elements.");
    }

    /* renamed from: n */
    public final List mo9602n() {
        return this.f15120a;
    }
}

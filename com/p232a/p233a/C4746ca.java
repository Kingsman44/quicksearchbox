package com.p232a.p233a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.a.a.ca */
/* compiled from: PG */
public final class C4746ca {

    /* renamed from: h */
    private static HashSet f14912h;

    /* renamed from: a */
    public final Canvas f14913a;

    /* renamed from: b */
    public final C4766m f14914b;

    /* renamed from: c */
    public C4734bp f14915c;

    /* renamed from: d */
    public C4741bw f14916d;

    /* renamed from: e */
    public Stack f14917e;

    /* renamed from: f */
    public Stack f14918f;

    /* renamed from: g */
    public Stack f14919g;

    protected C4746ca(Canvas canvas, C4766m mVar) {
        this.f14913a = canvas;
        this.f14914b = mVar;
    }

    /* renamed from: A */
    private final void m13153A(C4700ai aiVar, String str) {
        C4715ax c = aiVar.f14833t.mo9620c(str);
        if (c == null) {
            m13181h("Pattern reference '%s' not found", str);
        } else if (!(c instanceof C4700ai)) {
            m13180e("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (c == aiVar) {
            m13180e("Circular reference in pattern href attribute '%s'", str);
        } else {
            C4700ai aiVar2 = (C4700ai) c;
            if (aiVar.f14755a == null) {
                aiVar.f14755a = aiVar2.f14755a;
            }
            if (aiVar.f14756b == null) {
                aiVar.f14756b = aiVar2.f14756b;
            }
            if (aiVar.f14757c == null) {
                aiVar.f14757c = aiVar2.f14757c;
            }
            if (aiVar.f14758d == null) {
                aiVar.f14758d = aiVar2.f14758d;
            }
            if (aiVar.f14759e == null) {
                aiVar.f14759e = aiVar2.f14759e;
            }
            if (aiVar.f14760f == null) {
                aiVar.f14760f = aiVar2.f14760f;
            }
            if (aiVar.f14761g == null) {
                aiVar.f14761g = aiVar2.f14761g;
            }
            if (aiVar.f14813i.isEmpty()) {
                aiVar.f14813i = aiVar2.f14813i;
            }
            if (aiVar.f14841w == null) {
                aiVar.f14841w = aiVar2.f14841w;
            }
            if (aiVar.f14835v == null) {
                aiVar.f14835v = aiVar2.f14835v;
            }
            String str2 = aiVar2.f14762h;
            if (str2 != null) {
                m13153A(aiVar, str2);
            }
        }
    }

    /* renamed from: B */
    private static synchronized void m13154B() {
        synchronized (C4746ca.class) {
            HashSet hashSet = new HashSet();
            f14912h = hashSet;
            hashSet.add("Structure");
            f14912h.add("BasicStructure");
            f14912h.add("ConditionalProcessing");
            f14912h.add("Image");
            f14912h.add("Style");
            f14912h.add("ViewportAttribute");
            f14912h.add("Shape");
            f14912h.add("BasicText");
            f14912h.add("PaintAttribute");
            f14912h.add("BasicPaintAttribute");
            f14912h.add("OpacityAttribute");
            f14912h.add("BasicGraphicsAttribute");
            f14912h.add("Marker");
            f14912h.add("Gradient");
            f14912h.add("Pattern");
            f14912h.add("Clip");
            f14912h.add("BasicClip");
            f14912h.add("Mask");
            f14912h.add("View");
        }
    }

    /* renamed from: C */
    private final void m13155C() {
        this.f14918f.pop();
        this.f14919g.pop();
    }

    /* renamed from: D */
    private final void m13156D(C4711at atVar) {
        this.f14918f.push(atVar);
        this.f14919g.push(this.f14913a.getMatrix());
    }

    /* renamed from: E */
    private final void m13157E(C4715ax axVar) {
        C4779z zVar;
        C4779z zVar2;
        Path.FillType fillType;
        C4779z zVar3;
        int indexOf;
        Set g;
        C4779z zVar4;
        if (!(axVar instanceof C4695ad)) {
            m13164L();
            mo9633d(axVar);
            if (axVar instanceof C4707ap) {
                C4707ap apVar = (C4707ap) axVar;
                m13158F(apVar, apVar.f14811c, apVar.f14812d);
            } else {
                float f = 0.0f;
                if (axVar instanceof C4732bn) {
                    C4732bn bnVar = (C4732bn) axVar;
                    C4779z zVar5 = bnVar.f14857e;
                    if ((zVar5 == null || !zVar5.mo9686f()) && ((zVar4 = bnVar.f14858f) == null || !zVar4.mo9686f())) {
                        m13166N(this.f14916d, bnVar);
                        if (m13168P()) {
                            C4715ax c = bnVar.f14833t.mo9620c(bnVar.f14854a);
                            if (c == null) {
                                m13180e("Use reference '%s' not found", bnVar.f14854a);
                            } else {
                                Matrix matrix = bnVar.f15126b;
                                if (matrix != null) {
                                    this.f14913a.concat(matrix);
                                }
                                Matrix matrix2 = new Matrix();
                                C4779z zVar6 = bnVar.f14855c;
                                float c2 = zVar6 != null ? zVar6.mo9683c(this) : 0.0f;
                                C4779z zVar7 = bnVar.f14856d;
                                matrix2.preTranslate(c2, zVar7 != null ? zVar7.mo9684d(this) : 0.0f);
                                this.f14913a.concat(matrix2);
                                m13191s(bnVar, bnVar.f14823n);
                                boolean Q = m13169Q();
                                m13156D(bnVar);
                                if (c instanceof C4707ap) {
                                    m13164L();
                                    C4707ap apVar2 = (C4707ap) c;
                                    C4779z zVar8 = bnVar.f14857e;
                                    if (zVar8 == null) {
                                        zVar8 = apVar2.f14811c;
                                    }
                                    C4779z zVar9 = bnVar.f14858f;
                                    if (zVar9 == null) {
                                        zVar9 = apVar2.f14812d;
                                    }
                                    m13158F(apVar2, zVar8, zVar9);
                                    m13163K();
                                } else if (c instanceof C4722bd) {
                                    C4779z zVar10 = bnVar.f14857e;
                                    if (zVar10 == null) {
                                        zVar10 = new C4779z(100.0f, 9);
                                    }
                                    C4779z zVar11 = bnVar.f14858f;
                                    if (zVar11 == null) {
                                        zVar11 = new C4779z(100.0f, 9);
                                    }
                                    m13164L();
                                    C4722bd bdVar = (C4722bd) c;
                                    if (!zVar10.mo9686f() && !zVar11.mo9686f()) {
                                        C4765l lVar = bdVar.f14835v;
                                        if (lVar == null) {
                                            lVar = C4765l.f15098b;
                                        }
                                        m13166N(this.f14916d, bdVar);
                                        float c3 = zVar10.mo9683c(this);
                                        float c4 = zVar11.mo9683c(this);
                                        C4741bw bwVar = this.f14916d;
                                        bwVar.f14891f = new C4766m(0.0f, 0.0f, c3, c4);
                                        if (!bwVar.f14886a.f14797o.booleanValue()) {
                                            C4766m mVar = this.f14916d.f14891f;
                                            m13162J(mVar.f15101a, mVar.f15102b, mVar.f15103c, mVar.f15104d);
                                        }
                                        C4766m mVar2 = bdVar.f14841w;
                                        if (mVar2 != null) {
                                            this.f14913a.concat(m13172T(this.f14916d.f14891f, mVar2, lVar));
                                            this.f14916d.f14892g = bdVar.f14841w;
                                        }
                                        boolean Q2 = m13169Q();
                                        m13159G(bdVar, true);
                                        if (Q2) {
                                            m13177Y();
                                        }
                                        m13165M(bdVar);
                                    }
                                    m13163K();
                                } else {
                                    m13157E(c);
                                }
                                m13155C();
                                if (Q) {
                                    m13177Y();
                                }
                                m13165M(bnVar);
                            }
                        }
                    }
                } else if (axVar instanceof C4721bc) {
                    C4721bc bcVar = (C4721bc) axVar;
                    m13166N(this.f14916d, bcVar);
                    if (m13168P()) {
                        Matrix matrix3 = bcVar.f15126b;
                        if (matrix3 != null) {
                            this.f14913a.concat(matrix3);
                        }
                        m13191s(bcVar, bcVar.f14823n);
                        boolean Q3 = m13169Q();
                        String language = Locale.getDefault().getLanguage();
                        Iterator it = bcVar.f14813i.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C4715ax axVar2 = (C4715ax) it.next();
                            if (axVar2 instanceof C4708aq) {
                                C4708aq aqVar = (C4708aq) axVar2;
                                if (aqVar.mo9604c() == null && ((g = aqVar.mo9608g()) == null || (!g.isEmpty() && g.contains(language)))) {
                                    Set d = aqVar.mo9605d();
                                    if (d != null) {
                                        if (f14912h == null) {
                                            m13154B();
                                        }
                                        if (d.isEmpty()) {
                                            continue;
                                        } else if (!f14912h.containsAll(d)) {
                                            continue;
                                        }
                                    }
                                    Set f2 = aqVar.mo9607f();
                                    if (f2 == null) {
                                        Set e = aqVar.mo9606e();
                                        if (e == null) {
                                            m13157E(axVar2);
                                            break;
                                        }
                                        e.isEmpty();
                                    } else {
                                        f2.isEmpty();
                                    }
                                }
                            }
                        }
                        if (Q3) {
                            m13177Y();
                        }
                        m13165M(bcVar);
                    }
                } else if (axVar instanceof C4776w) {
                    C4776w wVar = (C4776w) axVar;
                    m13166N(this.f14916d, wVar);
                    if (m13168P()) {
                        Matrix matrix4 = wVar.f15126b;
                        if (matrix4 != null) {
                            this.f14913a.concat(matrix4);
                        }
                        m13191s(wVar, wVar.f14823n);
                        boolean Q4 = m13169Q();
                        m13159G(wVar, true);
                        if (Q4) {
                            m13177Y();
                        }
                        m13165M(wVar);
                    }
                } else {
                    Bitmap bitmap = null;
                    if (axVar instanceof C4778y) {
                        C4778y yVar = (C4778y) axVar;
                        C4779z zVar12 = yVar.f15130d;
                        if (!(zVar12 == null || zVar12.mo9686f() || (zVar3 = yVar.f15131e) == null || zVar3.mo9686f() || yVar.f15127a == null)) {
                            C4765l lVar2 = yVar.f14835v;
                            if (lVar2 == null) {
                                lVar2 = C4765l.f15098b;
                            }
                            String str = yVar.f15127a;
                            if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) != -1 && indexOf >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                                byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                            }
                            if (bitmap != null) {
                                m13166N(this.f14916d, yVar);
                                if (m13168P() && mo9636i()) {
                                    Matrix matrix5 = yVar.f15132f;
                                    if (matrix5 != null) {
                                        this.f14913a.concat(matrix5);
                                    }
                                    C4779z zVar13 = yVar.f15128b;
                                    float c5 = zVar13 != null ? zVar13.mo9683c(this) : 0.0f;
                                    C4779z zVar14 = yVar.f15129c;
                                    float d2 = zVar14 != null ? zVar14.mo9684d(this) : 0.0f;
                                    float c6 = yVar.f15130d.mo9683c(this);
                                    float c7 = yVar.f15131e.mo9683c(this);
                                    C4741bw bwVar2 = this.f14916d;
                                    bwVar2.f14891f = new C4766m(c5, d2, c6, c7);
                                    if (!bwVar2.f14886a.f14797o.booleanValue()) {
                                        C4766m mVar3 = this.f14916d.f14891f;
                                        m13162J(mVar3.f15101a, mVar3.f15102b, mVar3.f15103c, mVar3.f15104d);
                                    }
                                    yVar.f14823n = new C4766m(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
                                    this.f14913a.concat(m13172T(this.f14916d.f14891f, yVar.f14823n, lVar2));
                                    m13165M(yVar);
                                    m13191s(yVar, yVar.f14823n);
                                    boolean Q5 = m13169Q();
                                    m13167O();
                                    this.f14913a.drawBitmap(bitmap, 0.0f, 0.0f, new Paint());
                                    if (Q5) {
                                        m13177Y();
                                    }
                                }
                            }
                        }
                    } else if (axVar instanceof C4697af) {
                        C4697af afVar = (C4697af) axVar;
                        if (afVar.f14749a != null) {
                            m13166N(this.f14916d, afVar);
                            if (m13168P() && mo9636i()) {
                                C4741bw bwVar3 = this.f14916d;
                                if (bwVar3.f14888c || bwVar3.f14887b) {
                                    Matrix matrix6 = afVar.f15125e;
                                    if (matrix6 != null) {
                                        this.f14913a.concat(matrix6);
                                    }
                                    Path path = new C4737bs(afVar.f14749a).f14874a;
                                    if (afVar.f14823n == null) {
                                        afVar.f14823n = m13171S(path);
                                    }
                                    m13165M(afVar);
                                    m13192t(afVar);
                                    m13191s(afVar, afVar.f14823n);
                                    boolean Q6 = m13169Q();
                                    C4741bw bwVar4 = this.f14916d;
                                    if (bwVar4.f14887b) {
                                        if (bwVar4.f14886a.f14774D == 0) {
                                            fillType = Path.FillType.WINDING;
                                        } else {
                                            C4764k kVar = C4764k.None;
                                            int i = this.f14916d.f14886a.f14774D;
                                            int i2 = i - 1;
                                            if (i != 0) {
                                                fillType = i2 != 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                                            } else {
                                                throw null;
                                            }
                                        }
                                        path.setFillType(fillType);
                                        m13194v(afVar, path);
                                    }
                                    if (this.f14916d.f14888c) {
                                        m13195w(path);
                                    }
                                    m13161I(afVar);
                                    if (Q6) {
                                        m13177Y();
                                    }
                                }
                            }
                        }
                    } else if (axVar instanceof C4703al) {
                        C4703al alVar = (C4703al) axVar;
                        C4779z zVar15 = alVar.f14766c;
                        if (zVar15 != null && (zVar2 = alVar.f14767d) != null && !zVar15.mo9686f() && !zVar2.mo9686f()) {
                            m13166N(this.f14916d, alVar);
                            if (m13168P() && mo9636i()) {
                                Matrix matrix7 = alVar.f15125e;
                                if (matrix7 != null) {
                                    this.f14913a.concat(matrix7);
                                }
                                Path o = m13187o(alVar);
                                m13165M(alVar);
                                m13192t(alVar);
                                m13191s(alVar, alVar.f14823n);
                                boolean Q7 = m13169Q();
                                if (this.f14916d.f14887b) {
                                    m13194v(alVar, o);
                                }
                                if (this.f14916d.f14888c) {
                                    m13195w(o);
                                }
                                if (Q7) {
                                    m13177Y();
                                }
                            }
                        }
                    } else if (axVar instanceof C4768o) {
                        C4768o oVar = (C4768o) axVar;
                        C4779z zVar16 = oVar.f15111c;
                        if (zVar16 != null && !zVar16.mo9686f()) {
                            m13166N(this.f14916d, oVar);
                            if (m13168P() && mo9636i()) {
                                Matrix matrix8 = oVar.f15125e;
                                if (matrix8 != null) {
                                    this.f14913a.concat(matrix8);
                                }
                                Path l = m13184l(oVar);
                                m13165M(oVar);
                                m13192t(oVar);
                                m13191s(oVar, oVar.f14823n);
                                boolean Q8 = m13169Q();
                                if (this.f14916d.f14887b) {
                                    m13194v(oVar, l);
                                }
                                if (this.f14916d.f14888c) {
                                    m13195w(l);
                                }
                                if (Q8) {
                                    m13177Y();
                                }
                            }
                        }
                    } else if (axVar instanceof C4773t) {
                        C4773t tVar = (C4773t) axVar;
                        C4779z zVar17 = tVar.f15118c;
                        if (zVar17 != null && (zVar = tVar.f15119d) != null && !zVar17.mo9686f() && !zVar.mo9686f()) {
                            m13166N(this.f14916d, tVar);
                            if (m13168P() && mo9636i()) {
                                Matrix matrix9 = tVar.f15125e;
                                if (matrix9 != null) {
                                    this.f14913a.concat(matrix9);
                                }
                                Path m = m13185m(tVar);
                                m13165M(tVar);
                                m13192t(tVar);
                                m13191s(tVar, tVar.f14823n);
                                boolean Q9 = m13169Q();
                                if (this.f14916d.f14887b) {
                                    m13194v(tVar, m);
                                }
                                if (this.f14916d.f14888c) {
                                    m13195w(m);
                                }
                                if (Q9) {
                                    m13177Y();
                                }
                            }
                        }
                    } else if (axVar instanceof C4692aa) {
                        C4692aa aaVar = (C4692aa) axVar;
                        m13166N(this.f14916d, aaVar);
                        if (m13168P() && mo9636i() && this.f14916d.f14888c) {
                            Matrix matrix10 = aaVar.f15125e;
                            if (matrix10 != null) {
                                this.f14913a.concat(matrix10);
                            }
                            C4779z zVar18 = aaVar.f14735a;
                            float c8 = zVar18 == null ? 0.0f : zVar18.mo9683c(this);
                            C4779z zVar19 = aaVar.f14736b;
                            float d3 = zVar19 == null ? 0.0f : zVar19.mo9684d(this);
                            C4779z zVar20 = aaVar.f14737c;
                            float c9 = zVar20 == null ? 0.0f : zVar20.mo9683c(this);
                            C4779z zVar21 = aaVar.f14738d;
                            if (zVar21 != null) {
                                f = zVar21.mo9684d(this);
                            }
                            if (aaVar.f14823n == null) {
                                aaVar.f14823n = new C4766m(Math.min(c8, d3), Math.min(d3, f), Math.abs(c9 - c8), Math.abs(f - d3));
                            }
                            Path path2 = new Path();
                            path2.moveTo(c8, d3);
                            path2.lineTo(c9, f);
                            m13165M(aaVar);
                            m13192t(aaVar);
                            m13191s(aaVar, aaVar.f14823n);
                            boolean Q10 = m13169Q();
                            m13195w(path2);
                            m13161I(aaVar);
                            if (Q10) {
                                m13177Y();
                            }
                        }
                    } else if (axVar instanceof C4702ak) {
                        C4702ak akVar = (C4702ak) axVar;
                        m13166N(this.f14916d, akVar);
                        if (m13168P() && mo9636i()) {
                            C4741bw bwVar5 = this.f14916d;
                            if (bwVar5.f14888c || bwVar5.f14887b) {
                                Matrix matrix11 = akVar.f15125e;
                                if (matrix11 != null) {
                                    this.f14913a.concat(matrix11);
                                }
                                if (akVar.f14763a.length >= 2) {
                                    Path n = m13186n(akVar);
                                    m13165M(akVar);
                                    m13192t(akVar);
                                    m13191s(akVar, akVar.f14823n);
                                    boolean Q11 = m13169Q();
                                    if (this.f14916d.f14887b) {
                                        m13194v(akVar, n);
                                    }
                                    if (this.f14916d.f14888c) {
                                        m13195w(n);
                                    }
                                    m13161I(akVar);
                                    if (Q11) {
                                        m13177Y();
                                    }
                                }
                            }
                        }
                    } else if (axVar instanceof C4701aj) {
                        C4701aj ajVar = (C4701aj) axVar;
                        m13166N(this.f14916d, ajVar);
                        if (m13168P() && mo9636i()) {
                            C4741bw bwVar6 = this.f14916d;
                            if (bwVar6.f14888c || bwVar6.f14887b) {
                                Matrix matrix12 = ajVar.f15125e;
                                if (matrix12 != null) {
                                    this.f14913a.concat(matrix12);
                                }
                                if (ajVar.f14763a.length >= 2) {
                                    Path n2 = m13186n(ajVar);
                                    m13165M(ajVar);
                                    m13192t(ajVar);
                                    m13191s(ajVar, ajVar.f14823n);
                                    boolean Q12 = m13169Q();
                                    if (this.f14916d.f14887b) {
                                        m13194v(ajVar, n2);
                                    }
                                    if (this.f14916d.f14888c) {
                                        m13195w(n2);
                                    }
                                    m13161I(ajVar);
                                    if (Q12) {
                                        m13177Y();
                                    }
                                }
                            }
                        }
                    } else if (axVar instanceof C4725bg) {
                        C4725bg bgVar = (C4725bg) axVar;
                        m13166N(this.f14916d, bgVar);
                        if (m13168P()) {
                            Matrix matrix13 = bgVar.f14845a;
                            if (matrix13 != null) {
                                this.f14913a.concat(matrix13);
                            }
                            List list = bgVar.f14849b;
                            float c10 = (list == null || list.size() == 0) ? 0.0f : ((C4779z) bgVar.f14849b.get(0)).mo9683c(this);
                            List list2 = bgVar.f14850c;
                            float d4 = (list2 == null || list2.size() == 0) ? 0.0f : ((C4779z) bgVar.f14850c.get(0)).mo9684d(this);
                            List list3 = bgVar.f14851d;
                            float c11 = (list3 == null || list3.size() == 0) ? 0.0f : ((C4779z) bgVar.f14851d.get(0)).mo9683c(this);
                            List list4 = bgVar.f14852e;
                            if (!(list4 == null || list4.size() == 0)) {
                                f = ((C4779z) bgVar.f14852e.get(0)).mo9684d(this);
                            }
                            int R = m13170R();
                            if (R != 1) {
                                float j = m13182j(bgVar);
                                if (R == 2) {
                                    j /= 2.0f;
                                }
                                c10 -= j;
                            }
                            if (bgVar.f14823n == null) {
                                C4742bx bxVar = new C4742bx(this, c10, d4);
                                m13196x(bgVar, bxVar);
                                bgVar.f14823n = new C4766m(bxVar.f14897c.left, bxVar.f14897c.top, bxVar.f14897c.width(), bxVar.f14897c.height());
                            }
                            m13165M(bgVar);
                            m13192t(bgVar);
                            m13191s(bgVar, bgVar.f14823n);
                            boolean Q13 = m13169Q();
                            m13196x(bgVar, new C4739bu(this, c10 + c11, d4 + f));
                            if (Q13) {
                                m13177Y();
                            }
                        }
                    }
                }
            }
            m13163K();
        }
    }

    /* renamed from: F */
    private final void m13158F(C4707ap apVar, C4779z zVar, C4779z zVar2) {
        mo9634f(apVar, zVar, zVar2, apVar.f14841w, apVar.f14835v);
    }

    /* renamed from: G */
    private final void m13159G(C4711at atVar, boolean z) {
        if (z) {
            m13156D(atVar);
        }
        for (C4715ax E : atVar.mo9602n()) {
            m13157E(E);
        }
        if (z) {
            m13155C();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fe, code lost:
        r1 = -r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ff A[PHI: r1 
      PHI: (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:59:0x00f4, B:62:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013d  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13160H(com.p232a.p233a.C4693ab r12, com.p232a.p233a.C4736br r13) {
        /*
            r11 = this;
            r11.m13164L()
            java.lang.Float r0 = r12.f14744f
            r1 = 0
            if (r0 == 0) goto L_0x0033
            float r0 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x002c
            float r0 = r13.f14872c
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x001e
            float r2 = r13.f14873d
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0033
        L_0x001e:
            float r2 = r13.f14873d
            double r2 = (double) r2
            double r4 = (double) r0
            double r2 = java.lang.Math.atan2(r2, r4)
            double r2 = java.lang.Math.toDegrees(r2)
            float r0 = (float) r2
            goto L_0x0034
        L_0x002c:
            java.lang.Float r0 = r12.f14744f
            float r0 = r0.floatValue()
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            boolean r2 = r12.f14739a
            if (r2 == 0) goto L_0x003b
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0045
        L_0x003b:
            com.a.a.bw r2 = r11.f14916d
            com.a.a.ao r2 = r2.f14886a
            com.a.a.z r2 = r2.f14788f
            float r2 = r2.mo9687g()
        L_0x0045:
            com.a.a.bw r3 = r11.m13188p(r12)
            r11.f14916d = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float r4 = r13.f14870a
            float r13 = r13.f14871b
            r3.preTranslate(r4, r13)
            r3.preRotate(r0)
            r3.preScale(r2, r2)
            com.a.a.z r13 = r12.f14740b
            if (r13 == 0) goto L_0x0066
            float r13 = r13.mo9683c(r11)
            goto L_0x0067
        L_0x0066:
            r13 = 0
        L_0x0067:
            com.a.a.z r0 = r12.f14741c
            if (r0 == 0) goto L_0x0070
            float r0 = r0.mo9684d(r11)
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            com.a.a.z r2 = r12.f14742d
            r4 = 1077936128(0x40400000, float:3.0)
            if (r2 == 0) goto L_0x007c
            float r2 = r2.mo9683c(r11)
            goto L_0x007e
        L_0x007c:
            r2 = 1077936128(0x40400000, float:3.0)
        L_0x007e:
            com.a.a.z r5 = r12.f14743e
            if (r5 == 0) goto L_0x0086
            float r4 = r5.mo9684d(r11)
        L_0x0086:
            com.a.a.m r5 = r12.f14841w
            if (r5 == 0) goto L_0x011a
            float r6 = r5.f15103c
            float r6 = r2 / r6
            float r5 = r5.f15104d
            float r5 = r4 / r5
            com.a.a.l r7 = r12.f14835v
            if (r7 != 0) goto L_0x0098
            com.a.a.l r7 = com.p232a.p233a.C4765l.f15098b
        L_0x0098:
            com.a.a.l r8 = com.p232a.p233a.C4765l.f15097a
            boolean r8 = r7.equals(r8)
            r9 = 2
            if (r8 != 0) goto L_0x00b0
            int r8 = r7.f15100d
            if (r8 != r9) goto L_0x00aa
            float r5 = java.lang.Math.max(r6, r5)
            goto L_0x00ae
        L_0x00aa:
            float r5 = java.lang.Math.min(r6, r5)
        L_0x00ae:
            r6 = r5
            r5 = r6
        L_0x00b0:
            float r13 = -r13
            float r13 = r13 * r6
            float r0 = -r0
            float r0 = r0 * r5
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.f14913a
            r13.concat(r3)
            com.a.a.m r13 = r12.f14841w
            float r0 = r13.f15103c
            float r0 = r0 * r6
            float r13 = r13.f15104d
            float r13 = r13 * r5
            com.a.a.k r8 = com.p232a.p233a.C4764k.None
            com.a.a.k r8 = r7.f15099c
            int r8 = r8.ordinal()
            r10 = 1073741824(0x40000000, float:2.0)
            if (r8 == r9) goto L_0x00ea
            r9 = 3
            if (r8 == r9) goto L_0x00e7
            r9 = 5
            if (r8 == r9) goto L_0x00ea
            r9 = 6
            if (r8 == r9) goto L_0x00e7
            r9 = 8
            if (r8 == r9) goto L_0x00ea
            r9 = 9
            if (r8 == r9) goto L_0x00e7
            r0 = 0
            goto L_0x00ee
        L_0x00e7:
            float r0 = r2 - r0
            goto L_0x00ed
        L_0x00ea:
            float r0 = r2 - r0
            float r0 = r0 / r10
        L_0x00ed:
            float r0 = -r0
        L_0x00ee:
            com.a.a.k r7 = r7.f15099c
            int r7 = r7.ordinal()
            switch(r7) {
                case 4: goto L_0x00fb;
                case 5: goto L_0x00fb;
                case 6: goto L_0x00fb;
                case 7: goto L_0x00f8;
                case 8: goto L_0x00f8;
                case 9: goto L_0x00f8;
                default: goto L_0x00f7;
            }
        L_0x00f7:
            goto L_0x00ff
        L_0x00f8:
            float r13 = r4 - r13
            goto L_0x00fe
        L_0x00fb:
            float r13 = r4 - r13
            float r13 = r13 / r10
        L_0x00fe:
            float r1 = -r13
        L_0x00ff:
            com.a.a.bw r13 = r11.f14916d
            com.a.a.ao r13 = r13.f14886a
            java.lang.Boolean r13 = r13.f14797o
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x010e
            r11.m13162J(r0, r1, r2, r4)
        L_0x010e:
            r3.reset()
            r3.preScale(r6, r5)
            android.graphics.Canvas r13 = r11.f14913a
            r13.concat(r3)
            goto L_0x0133
        L_0x011a:
            float r13 = -r13
            float r0 = -r0
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.f14913a
            r13.concat(r3)
            com.a.a.bw r13 = r11.f14916d
            com.a.a.ao r13 = r13.f14886a
            java.lang.Boolean r13 = r13.f14797o
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0133
            r11.m13162J(r1, r1, r2, r4)
        L_0x0133:
            boolean r13 = r11.m13169Q()
            r0 = 0
            r11.m13159G(r12, r0)
            if (r13 == 0) goto L_0x0140
            r11.m13177Y()
        L_0x0140:
            r11.m13163K()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p232a.p233a.C4746ca.m13160H(com.a.a.ab, com.a.a.br):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0156 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0157  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13161I(com.p232a.p233a.C4775v r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.a.a.bw r2 = r0.f14916d
            com.a.a.ao r2 = r2.f14886a
            java.lang.String r3 = r2.f14799q
            if (r3 != 0) goto L_0x0016
            java.lang.String r4 = r2.f14800r
            if (r4 != 0) goto L_0x0016
            java.lang.String r2 = r2.f14801s
            if (r2 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            return
        L_0x0016:
            java.lang.String r2 = "Marker reference '%s' not found"
            r4 = 0
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0035
            com.a.a.bp r7 = r1.f14833t
            com.a.a.ax r3 = r7.mo9620c(r3)
            if (r3 == 0) goto L_0x0028
            com.a.a.ab r3 = (com.p232a.p233a.C4693ab) r3
            goto L_0x0036
        L_0x0028:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.a.a.bw r7 = r0.f14916d
            com.a.a.ao r7 = r7.f14886a
            java.lang.String r7 = r7.f14799q
            r3[r4] = r7
            m13180e(r2, r3)
        L_0x0035:
            r3 = r6
        L_0x0036:
            com.a.a.bw r7 = r0.f14916d
            com.a.a.ao r7 = r7.f14886a
            java.lang.String r7 = r7.f14800r
            if (r7 == 0) goto L_0x0056
            com.a.a.bp r8 = r1.f14833t
            com.a.a.ax r7 = r8.mo9620c(r7)
            if (r7 == 0) goto L_0x0049
            com.a.a.ab r7 = (com.p232a.p233a.C4693ab) r7
            goto L_0x0057
        L_0x0049:
            java.lang.Object[] r7 = new java.lang.Object[r5]
            com.a.a.bw r8 = r0.f14916d
            com.a.a.ao r8 = r8.f14886a
            java.lang.String r8 = r8.f14800r
            r7[r4] = r8
            m13180e(r2, r7)
        L_0x0056:
            r7 = r6
        L_0x0057:
            com.a.a.bw r8 = r0.f14916d
            com.a.a.ao r8 = r8.f14886a
            java.lang.String r8 = r8.f14801s
            if (r8 == 0) goto L_0x0077
            com.a.a.bp r9 = r1.f14833t
            com.a.a.ax r8 = r9.mo9620c(r8)
            if (r8 == 0) goto L_0x006a
            com.a.a.ab r8 = (com.p232a.p233a.C4693ab) r8
            goto L_0x0078
        L_0x006a:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            com.a.a.bw r9 = r0.f14916d
            com.a.a.ao r9 = r9.f14886a
            java.lang.String r9 = r9.f14801s
            r8[r4] = r9
            m13180e(r2, r8)
        L_0x0077:
            r8 = r6
        L_0x0078:
            boolean r2 = r1 instanceof com.p232a.p233a.C4697af
            if (r2 == 0) goto L_0x0089
            com.a.a.bq r2 = new com.a.a.bq
            com.a.a.af r1 = (com.p232a.p233a.C4697af) r1
            com.a.a.ag r1 = r1.f14749a
            r2.<init>(r1)
            java.util.List r1 = r2.f14862a
            goto L_0x014d
        L_0x0089:
            boolean r2 = r1 instanceof com.p232a.p233a.C4692aa
            r9 = 2
            r10 = 0
            if (r2 == 0) goto L_0x00d2
            com.a.a.aa r1 = (com.p232a.p233a.C4692aa) r1
            com.a.a.z r2 = r1.f14735a
            if (r2 == 0) goto L_0x009a
            float r2 = r2.mo9683c(r0)
            goto L_0x009b
        L_0x009a:
            r2 = 0
        L_0x009b:
            com.a.a.z r11 = r1.f14736b
            if (r11 == 0) goto L_0x00a4
            float r11 = r11.mo9684d(r0)
            goto L_0x00a5
        L_0x00a4:
            r11 = 0
        L_0x00a5:
            com.a.a.z r12 = r1.f14737c
            if (r12 == 0) goto L_0x00ae
            float r12 = r12.mo9683c(r0)
            goto L_0x00af
        L_0x00ae:
            r12 = 0
        L_0x00af:
            com.a.a.z r1 = r1.f14738d
            if (r1 == 0) goto L_0x00b7
            float r10 = r1.mo9684d(r0)
        L_0x00b7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            float r9 = r12 - r2
            float r13 = r10 - r11
            com.a.a.br r14 = new com.a.a.br
            r14.<init>(r2, r11, r9, r13)
            r1.add(r14)
            com.a.a.br r2 = new com.a.a.br
            r2.<init>(r12, r10, r9, r13)
            r1.add(r2)
            goto L_0x014d
        L_0x00d2:
            com.a.a.aj r1 = (com.p232a.p233a.C4701aj) r1
            float[] r2 = r1.f14763a
            int r2 = r2.length
            if (r2 >= r9) goto L_0x00dc
            r1 = r6
            goto L_0x014d
        L_0x00dc:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.a.a.br r12 = new com.a.a.br
            float[] r13 = r1.f14763a
            r14 = r13[r4]
            r13 = r13[r5]
            r12.<init>(r14, r13, r10, r10)
            r13 = r12
            r12 = 0
        L_0x00ee:
            if (r9 >= r2) goto L_0x0114
            float[] r10 = r1.f14763a
            r12 = r10[r9]
            int r14 = r9 + 1
            r10 = r10[r14]
            r13.mo9626b(r12, r10)
            r11.add(r13)
            com.a.a.br r14 = new com.a.a.br
            float r15 = r13.f14870a
            float r15 = r12 - r15
            float r13 = r13.f14871b
            float r13 = r10 - r13
            r14.<init>(r12, r10, r15, r13)
            int r9 = r9 + 2
            r13 = r14
            r16 = r12
            r12 = r10
            r10 = r16
            goto L_0x00ee
        L_0x0114:
            boolean r2 = r1 instanceof com.p232a.p233a.C4702ak
            if (r2 == 0) goto L_0x0149
            float[] r1 = r1.f14763a
            r2 = r1[r4]
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x014c
            r1 = r1[r5]
            int r9 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r9 == 0) goto L_0x014c
            r13.mo9626b(r2, r1)
            r11.add(r13)
            com.a.a.br r9 = new com.a.a.br
            float r10 = r13.f14870a
            float r10 = r2 - r10
            float r12 = r13.f14871b
            float r12 = r1 - r12
            r9.<init>(r2, r1, r10, r12)
            java.lang.Object r1 = r11.get(r4)
            com.a.a.br r1 = (com.p232a.p233a.C4736br) r1
            r9.mo9625a(r1)
            r11.add(r9)
            r11.set(r4, r9)
            goto L_0x014c
        L_0x0149:
            r11.add(r13)
        L_0x014c:
            r1 = r11
        L_0x014d:
            if (r1 != 0) goto L_0x0150
            return
        L_0x0150:
            int r2 = r1.size()
            if (r2 != 0) goto L_0x0157
            return
        L_0x0157:
            com.a.a.bw r9 = r0.f14916d
            com.a.a.ao r9 = r9.f14886a
            r9.f14801s = r6
            r9.f14800r = r6
            r9.f14799q = r6
            if (r3 == 0) goto L_0x016c
            java.lang.Object r4 = r1.get(r4)
            com.a.a.br r4 = (com.p232a.p233a.C4736br) r4
            r0.m13160H(r3, r4)
        L_0x016c:
            if (r7 == 0) goto L_0x017e
        L_0x016e:
            int r3 = r2 + -1
            if (r5 >= r3) goto L_0x017e
            java.lang.Object r3 = r1.get(r5)
            com.a.a.br r3 = (com.p232a.p233a.C4736br) r3
            r0.m13160H(r7, r3)
            int r5 = r5 + 1
            goto L_0x016e
        L_0x017e:
            if (r8 == 0) goto L_0x018b
            int r2 = r2 + -1
            java.lang.Object r1 = r1.get(r2)
            com.a.a.br r1 = (com.p232a.p233a.C4736br) r1
            r0.m13160H(r8, r1)
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p232a.p233a.C4746ca.m13161I(com.a.a.v):void");
    }

    /* renamed from: J */
    private final void m13162J(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        C4767n nVar = this.f14916d.f14886a.f14798p;
        if (nVar != null) {
            f += nVar.f15108d.mo9683c(this);
            f2 += this.f14916d.f14886a.f14798p.f15105a.mo9684d(this);
            f5 -= this.f14916d.f14886a.f14798p.f15106b.mo9683c(this);
            f6 -= this.f14916d.f14886a.f14798p.f15107c.mo9684d(this);
        }
        this.f14913a.clipRect(f, f2, f5, f6);
    }

    /* renamed from: K */
    private final void m13163K() {
        this.f14913a.restore();
        this.f14916d = (C4741bw) this.f14917e.pop();
    }

    /* renamed from: L */
    private final void m13164L() {
        this.f14913a.save();
        this.f14917e.push(this.f14916d);
        this.f14916d = (C4741bw) this.f14916d.clone();
    }

    /* renamed from: M */
    private final void m13165M(C4712au auVar) {
        if (auVar.f14834u != null && auVar.f14823n != null) {
            Matrix matrix = new Matrix();
            if (((Matrix) this.f14919g.peek()).invert(matrix)) {
                C4766m mVar = auVar.f14823n;
                float f = mVar.f15101a;
                float f2 = mVar.f15102b;
                float f3 = mVar.f15103c + f;
                float f4 = f2 + mVar.f15104d;
                float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
                matrix.preConcat(this.f14913a.getMatrix());
                matrix.mapPoints(fArr);
                float f5 = fArr[0];
                float f6 = fArr[1];
                RectF rectF = new RectF(f5, f6, f5, f6);
                for (int i = 2; i <= 6; i += 2) {
                    if (fArr[i] < rectF.left) {
                        rectF.left = fArr[i];
                    }
                    if (fArr[i] > rectF.right) {
                        rectF.right = fArr[i];
                    }
                    int i2 = i + 1;
                    if (fArr[i2] < rectF.top) {
                        rectF.top = fArr[i2];
                    }
                    if (fArr[i2] > rectF.bottom) {
                        rectF.bottom = fArr[i2];
                    }
                }
                C4712au auVar2 = (C4712au) this.f14918f.peek();
                C4766m mVar2 = auVar2.f14823n;
                if (mVar2 == null) {
                    auVar2.f14823n = C4766m.m13276a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
                C4766m a = C4766m.m13276a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                float f7 = a.f15101a;
                float f8 = mVar2.f15101a;
                if (f7 < f8) {
                    mVar2.f15101a = f7;
                } else {
                    f7 = f8;
                }
                float f9 = a.f15102b;
                float f10 = mVar2.f15102b;
                if (f9 < f10) {
                    mVar2.f15102b = f9;
                } else {
                    f9 = f10;
                }
                float f11 = a.f15101a + a.f15103c;
                if (f11 > mVar2.f15103c + f7) {
                    mVar2.f15103c = f11 - f7;
                }
                float f12 = a.f15102b + a.f15104d;
                if (f12 > mVar2.f15104d + f9) {
                    mVar2.f15104d = f12 - f9;
                }
            }
        }
    }

    /* renamed from: N */
    private final void m13166N(C4741bw bwVar, C4713av avVar) {
        boolean z;
        C4711at atVar = avVar.f14834u;
        C4706ao aoVar = bwVar.f14886a;
        aoVar.f14802t = Boolean.TRUE;
        aoVar.f14797o = atVar == null ? Boolean.TRUE : Boolean.FALSE;
        aoVar.f14798p = null;
        aoVar.f14806x = null;
        Float valueOf = Float.valueOf(1.0f);
        aoVar.f14792j = valueOf;
        aoVar.f14804v = C4770q.f15113a;
        aoVar.f14805w = valueOf;
        aoVar.f14807y = null;
        aoVar.f14808z = null;
        aoVar.f14771A = valueOf;
        aoVar.f14772B = null;
        aoVar.f14773C = valueOf;
        aoVar.f14782L = 1;
        C4706ao aoVar2 = avVar.f14826q;
        if (aoVar2 != null) {
            mo9635g(bwVar, aoVar2);
        }
        List list = this.f14915c.f14860b.f15072a;
        if (list != null && !list.isEmpty()) {
            for (C4757d dVar : this.f14915c.f14860b.f15072a) {
                C4759f fVar = dVar.f15070a;
                ArrayList arrayList = new ArrayList();
                for (C4711at atVar2 = avVar.f14834u; atVar2 != null; atVar2 = ((C4715ax) atVar2).f14834u) {
                    arrayList.add(0, atVar2);
                }
                int size = arrayList.size() - 1;
                if (fVar.mo9669a() == 1) {
                    z = C4761h.m13269d(fVar.mo9670b(0), arrayList, size, avVar);
                } else {
                    z = C4761h.m13268c(fVar, fVar.mo9669a() - 1, arrayList, size, avVar);
                }
                if (z) {
                    mo9635g(bwVar, dVar.f15071b);
                }
            }
        }
        C4706ao aoVar3 = avVar.f14827r;
        if (aoVar3 != null) {
            mo9635g(bwVar, aoVar3);
        }
    }

    /* renamed from: O */
    private final void m13167O() {
        int i;
        C4706ao aoVar = this.f14916d.f14886a;
        C4716ay ayVar = aoVar.f14772B;
        if (ayVar instanceof C4770q) {
            i = ((C4770q) ayVar).f15114b;
        } else if (ayVar instanceof C4771r) {
            i = aoVar.f14793k.f15114b;
        } else {
            return;
        }
        Float f = aoVar.f14773C;
        if (f != null) {
            i |= m13174V(f.floatValue()) << 24;
        }
        this.f14913a.drawColor(i);
    }

    /* renamed from: P */
    private final boolean m13168P() {
        Boolean bool = this.f14916d.f14886a.f14802t;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: Q */
    private final boolean m13169Q() {
        C4741bw bwVar = this.f14916d;
        if (bwVar.f14886a.f14807y != null) {
            boolean z = bwVar.f14894i;
            m13181h("Masks are not supported when using getPicture()", new Object[0]);
        }
        if (this.f14916d.f14886a.f14792j.floatValue() >= 1.0f) {
            C4741bw bwVar2 = this.f14916d;
            if (bwVar2.f14886a.f14807y != null) {
                boolean z2 = bwVar2.f14894i;
            }
            return false;
        }
        this.f14913a.saveLayerAlpha((RectF) null, m13174V(this.f14916d.f14886a.f14792j.floatValue()), 31);
        this.f14917e.push(this.f14916d);
        C4741bw bwVar3 = (C4741bw) this.f14916d.clone();
        this.f14916d = bwVar3;
        if (bwVar3.f14886a.f14807y == null) {
            return true;
        }
        boolean z3 = bwVar3.f14894i;
        return true;
    }

    /* renamed from: R */
    private final int m13170R() {
        int i;
        C4706ao aoVar = this.f14916d.f14886a;
        if (aoVar.f14779I == 1 || (i = aoVar.f14780J) == 2) {
            return aoVar.f14780J;
        }
        return i == 1 ? 3 : 1;
    }

    /* renamed from: S */
    private static final C4766m m13171S(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C4766m(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r7 != 9) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[PHI: r4 
      PHI: (r4v2 float) = (r4v1 float), (r4v3 float) binds: [B:26:0x0066, B:29:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final android.graphics.Matrix m13172T(com.p232a.p233a.C4766m r9, com.p232a.p233a.C4766m r10, com.p232a.p233a.C4765l r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L_0x008e
            com.a.a.k r1 = r11.f15099c
            if (r1 != 0) goto L_0x000d
            goto L_0x008e
        L_0x000d:
            float r1 = r9.f15103c
            float r2 = r10.f15103c
            float r1 = r1 / r2
            float r2 = r9.f15104d
            float r3 = r10.f15104d
            float r2 = r2 / r3
            float r3 = r10.f15101a
            float r3 = -r3
            float r4 = r10.f15102b
            float r4 = -r4
            com.a.a.l r5 = com.p232a.p233a.C4765l.f15097a
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x0081
            int r5 = r11.f15100d
            r6 = 2
            if (r5 != r6) goto L_0x002f
            float r1 = java.lang.Math.max(r1, r2)
            goto L_0x0033
        L_0x002f:
            float r1 = java.lang.Math.min(r1, r2)
        L_0x0033:
            float r2 = r9.f15103c
            float r2 = r2 / r1
            float r5 = r9.f15104d
            float r5 = r5 / r1
            com.a.a.k r7 = com.p232a.p233a.C4764k.None
            com.a.a.k r7 = r11.f15099c
            int r7 = r7.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L_0x005b
            r6 = 3
            if (r7 == r6) goto L_0x0057
            r6 = 5
            if (r7 == r6) goto L_0x005b
            r6 = 6
            if (r7 == r6) goto L_0x0057
            r6 = 8
            if (r7 == r6) goto L_0x005b
            r6 = 9
            if (r7 == r6) goto L_0x0057
            goto L_0x0060
        L_0x0057:
            float r6 = r10.f15103c
            float r6 = r6 - r2
            goto L_0x005f
        L_0x005b:
            float r6 = r10.f15103c
            float r6 = r6 - r2
            float r6 = r6 / r8
        L_0x005f:
            float r3 = r3 - r6
        L_0x0060:
            com.a.a.k r11 = r11.f15099c
            int r11 = r11.ordinal()
            switch(r11) {
                case 4: goto L_0x006e;
                case 5: goto L_0x006e;
                case 6: goto L_0x006e;
                case 7: goto L_0x006a;
                case 8: goto L_0x006a;
                case 9: goto L_0x006a;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x0073
        L_0x006a:
            float r10 = r10.f15104d
            float r10 = r10 - r5
            goto L_0x0072
        L_0x006e:
            float r10 = r10.f15104d
            float r10 = r10 - r5
            float r10 = r10 / r8
        L_0x0072:
            float r4 = r4 - r10
        L_0x0073:
            float r10 = r9.f15101a
            float r9 = r9.f15102b
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
            return r0
        L_0x0081:
            float r10 = r9.f15101a
            float r9 = r9.f15102b
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p232a.p233a.C4746ca.m13172T(com.a.a.m, com.a.a.m, com.a.a.l):android.graphics.Matrix");
    }

    /* renamed from: U */
    private static final Typeface m13173U(String str, Integer num, int i) {
        int i2 = 2;
        if (num.intValue() > 500) {
            i2 = i == 2 ? 3 : 1;
        } else if (i != 2) {
            i2 = 0;
        }
        if (str.equals("serif")) {
            return Typeface.create(Typeface.SERIF, i2);
        }
        if (str.equals("sans-serif")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        if (str.equals("monospace")) {
            return Typeface.create(Typeface.MONOSPACE, i2);
        }
        if (str.equals("cursive")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        if (!str.equals("fantasy")) {
            return null;
        }
        return Typeface.create(Typeface.SANS_SERIF, i2);
    }

    /* renamed from: V */
    private static final int m13174V(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        return i > 255 ? PrivateKeyType.INVALID : i;
    }

    /* renamed from: W */
    private final void m13175W(C4715ax axVar, C4741bw bwVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (axVar instanceof C4713av) {
                arrayList.add(0, (C4713av) axVar);
            }
            C4711at atVar = axVar.f14834u;
            if (atVar == null) {
                break;
            }
            axVar = (C4715ax) atVar;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m13166N(bwVar, (C4713av) arrayList.get(i));
        }
        bwVar.f14892g = this.f14915c.f14859a.f14841w;
        if (bwVar.f14892g == null) {
            bwVar.f14892g = this.f14914b;
        }
        bwVar.f14891f = this.f14914b;
        boolean z = this.f14916d.f14894i;
        bwVar.f14894i = false;
    }

    /* renamed from: X */
    private static final boolean m13176X(C4706ao aoVar, long j) {
        return (j & aoVar.f14783a) != 0;
    }

    /* renamed from: Y */
    private final void m13177Y() {
        C4741bw bwVar = this.f14916d;
        if (bwVar.f14886a.f14807y != null) {
            boolean z = bwVar.f14894i;
        }
        m13163K();
    }

    /* renamed from: Z */
    private static final void m13178Z(C4741bw bwVar, boolean z, C4716ay ayVar) {
        int i;
        C4706ao aoVar = bwVar.f14886a;
        float floatValue = (z ? aoVar.f14785c : aoVar.f14787e).floatValue();
        if (ayVar instanceof C4770q) {
            i = ((C4770q) ayVar).f15114b;
        } else if (ayVar instanceof C4771r) {
            i = bwVar.f14886a.f14793k.f15114b;
        } else {
            return;
        }
        int V = i | (m13174V(floatValue) << 24);
        if (z) {
            bwVar.f14889d.setColor(V);
        } else {
            bwVar.f14890e.setColor(V);
        }
    }

    /* renamed from: e */
    public static void m13180e(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: h */
    public static void m13181h(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: j */
    private final float m13182j(C4727bi biVar) {
        C4744bz bzVar = new C4744bz(this);
        m13196x(biVar, bzVar);
        return bzVar.f14899a;
    }

    /* renamed from: k */
    private final Path.FillType m13183k() {
        if (this.f14916d.f14886a.f14781K == 0) {
            return Path.FillType.WINDING;
        }
        C4764k kVar = C4764k.None;
        int i = this.f14916d.f14886a.f14781K;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
        }
        throw null;
    }

    /* renamed from: l */
    private final Path m13184l(C4768o oVar) {
        C4768o oVar2 = oVar;
        C4779z zVar = oVar2.f15109a;
        float f = 0.0f;
        float c = zVar != null ? zVar.mo9683c(this) : 0.0f;
        C4779z zVar2 = oVar2.f15110b;
        if (zVar2 != null) {
            f = zVar2.mo9684d(this);
        }
        float a = oVar2.f15111c.mo9681a(this);
        float f2 = c - a;
        float f3 = f - a;
        float f4 = c + a;
        float f5 = f + a;
        if (oVar2.f14823n == null) {
            float f6 = a + a;
            oVar2.f14823n = new C4766m(f2, f3, f6, f6);
        }
        float f7 = 0.5522848f * a;
        Path path = new Path();
        path.moveTo(c, f3);
        float f8 = c + f7;
        float f9 = f - f7;
        Path path2 = path;
        path2.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        path2.cubicTo(f4, f10, f8, f5, c, f5);
        float f11 = c - f7;
        path2.cubicTo(f11, f5, f2, f10, f2, f);
        path2.cubicTo(f2, f9, f11, f3, c, f3);
        path.close();
        return path;
    }

    /* renamed from: m */
    private final Path m13185m(C4773t tVar) {
        C4773t tVar2 = tVar;
        C4779z zVar = tVar2.f15116a;
        float f = 0.0f;
        float c = zVar != null ? zVar.mo9683c(this) : 0.0f;
        C4779z zVar2 = tVar2.f15117b;
        if (zVar2 != null) {
            f = zVar2.mo9684d(this);
        }
        float c2 = tVar2.f15118c.mo9683c(this);
        float d = tVar2.f15119d.mo9684d(this);
        float f2 = c - c2;
        float f3 = f - d;
        float f4 = c + c2;
        float f5 = f + d;
        if (tVar2.f14823n == null) {
            tVar2.f14823n = new C4766m(f2, f3, c2 + c2, d + d);
        }
        float f6 = c2 * 0.5522848f;
        float f7 = 0.5522848f * d;
        Path path = new Path();
        path.moveTo(c, f3);
        float f8 = c + f6;
        float f9 = f - f7;
        Path path2 = path;
        path.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f7 + f;
        Path path3 = path2;
        path3.cubicTo(f4, f10, f8, f5, c, f5);
        float f11 = c - f6;
        path3.cubicTo(f11, f5, f2, f10, f2, f);
        path3.cubicTo(f2, f9, f11, f3, c, f3);
        path2.close();
        return path2;
    }

    /* renamed from: n */
    private final Path m13186n(C4701aj ajVar) {
        Path path = new Path();
        float[] fArr = ajVar.f14763a;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = ajVar.f14763a;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (ajVar instanceof C4702ak) {
            path.close();
        }
        if (ajVar.f14823n == null) {
            ajVar.f14823n = m13171S(path);
        }
        path.setFillType(m13183k());
        return path;
    }

    /* renamed from: o */
    private final Path m13187o(C4703al alVar) {
        float f;
        float f2;
        Path path;
        C4703al alVar2 = alVar;
        C4779z zVar = alVar2.f14768f;
        if (zVar == null && alVar2.f14769g == null) {
            f2 = 0.0f;
            f = 0.0f;
        } else {
            if (zVar == null) {
                f2 = alVar2.f14769g.mo9684d(this);
            } else if (alVar2.f14769g == null) {
                f2 = zVar.mo9683c(this);
            } else {
                f2 = zVar.mo9683c(this);
                f = alVar2.f14769g.mo9684d(this);
            }
            f = f2;
        }
        float min = Math.min(f2, alVar2.f14766c.mo9683c(this) / 2.0f);
        float min2 = Math.min(f, alVar2.f14767d.mo9684d(this) / 2.0f);
        C4779z zVar2 = alVar2.f14764a;
        float c = zVar2 != null ? zVar2.mo9683c(this) : 0.0f;
        C4779z zVar3 = alVar2.f14765b;
        float d = zVar3 != null ? zVar3.mo9684d(this) : 0.0f;
        float c2 = alVar2.f14766c.mo9683c(this);
        float d2 = alVar2.f14767d.mo9684d(this);
        if (alVar2.f14823n == null) {
            alVar2.f14823n = new C4766m(c, d, c2, d2);
        }
        float f3 = c + c2;
        float f4 = d + d2;
        Path path2 = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path = path2;
            path.moveTo(c, d);
            path.lineTo(f3, d);
            path.lineTo(f3, f4);
            path.lineTo(c, f4);
            path.lineTo(c, d);
        } else {
            float f5 = min * 0.5522848f;
            float f6 = 0.5522848f * min2;
            float f7 = d + min2;
            path2.moveTo(c, f7);
            float f8 = f7 - f6;
            float f9 = c + min;
            float f10 = f9 - f5;
            path2.cubicTo(c, f8, f10, d, f9, d);
            float f11 = f3 - min;
            path2.lineTo(f11, d);
            float f12 = f11 + f5;
            float f13 = f7;
            path2.cubicTo(f12, d, f3, f8, f3, f13);
            float f14 = f4 - min2;
            path2.lineTo(f3, f14);
            float f15 = f14 + f6;
            path = path2;
            path2.cubicTo(f3, f15, f12, f4, f11, f4);
            path.lineTo(f9, f4);
            path.cubicTo(f10, f4, c, f15, c, f14);
            path.lineTo(c, f13);
        }
        path.close();
        return path;
    }

    /* renamed from: p */
    private final C4741bw m13188p(C4715ax axVar) {
        C4741bw bwVar = new C4741bw();
        mo9635g(bwVar, C4706ao.m13074a());
        m13175W(axVar, bwVar);
        return bwVar;
    }

    /* renamed from: q */
    private final String m13189q(String str, boolean z, boolean z2) {
        if (this.f14916d.f14893h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", BuildConfig.FLAVOR).replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", BuildConfig.FLAVOR);
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", BuildConfig.FLAVOR);
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    /* renamed from: r */
    private final void m13190r(C4715ax axVar, boolean z, Path path, Matrix matrix) {
        Path path2;
        if (m13168P()) {
            this.f14913a.save();
            this.f14917e.push(this.f14916d);
            C4741bw bwVar = (C4741bw) this.f14916d.clone();
            this.f14916d = bwVar;
            if (axVar instanceof C4732bn) {
                if (z) {
                    C4732bn bnVar = (C4732bn) axVar;
                    m13166N(bwVar, bnVar);
                    if (m13168P() && mo9636i()) {
                        Matrix matrix2 = bnVar.f15126b;
                        if (matrix2 != null) {
                            matrix.preConcat(matrix2);
                        }
                        C4715ax c = bnVar.f14833t.mo9620c(bnVar.f14854a);
                        if (c == null) {
                            m13180e("Use reference '%s' not found", bnVar.f14854a);
                        } else {
                            m13191s(bnVar, bnVar.f14823n);
                            m13190r(c, false, path, matrix);
                        }
                    }
                } else {
                    m13180e("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (axVar instanceof C4697af) {
                C4697af afVar = (C4697af) axVar;
                m13166N(bwVar, afVar);
                if (m13168P() && mo9636i()) {
                    Matrix matrix3 = afVar.f15125e;
                    if (matrix3 != null) {
                        matrix.preConcat(matrix3);
                    }
                    Path path3 = new C4737bs(afVar.f14749a).f14874a;
                    if (afVar.f14823n == null) {
                        afVar.f14823n = m13171S(path3);
                    }
                    m13191s(afVar, afVar.f14823n);
                    path.setFillType(m13183k());
                    path.addPath(path3, matrix);
                }
            } else if (axVar instanceof C4725bg) {
                C4725bg bgVar = (C4725bg) axVar;
                m13166N(bwVar, bgVar);
                if (m13168P()) {
                    Matrix matrix4 = bgVar.f14845a;
                    if (matrix4 != null) {
                        matrix.preConcat(matrix4);
                    }
                    List list = bgVar.f14849b;
                    float f = 0.0f;
                    float c2 = (list == null || list.size() == 0) ? 0.0f : ((C4779z) bgVar.f14849b.get(0)).mo9683c(this);
                    List list2 = bgVar.f14850c;
                    float d = (list2 == null || list2.size() == 0) ? 0.0f : ((C4779z) bgVar.f14850c.get(0)).mo9684d(this);
                    List list3 = bgVar.f14851d;
                    float c3 = (list3 == null || list3.size() == 0) ? 0.0f : ((C4779z) bgVar.f14851d.get(0)).mo9683c(this);
                    List list4 = bgVar.f14852e;
                    if (!(list4 == null || list4.size() == 0)) {
                        f = ((C4779z) bgVar.f14852e.get(0)).mo9684d(this);
                    }
                    if (this.f14916d.f14886a.f14780J != 1) {
                        float j = m13182j(bgVar);
                        if (this.f14916d.f14886a.f14780J == 2) {
                            j /= 2.0f;
                        }
                        c2 -= j;
                    }
                    if (bgVar.f14823n == null) {
                        C4742bx bxVar = new C4742bx(this, c2, d);
                        m13196x(bgVar, bxVar);
                        bgVar.f14823n = new C4766m(bxVar.f14897c.left, bxVar.f14897c.top, bxVar.f14897c.width(), bxVar.f14897c.height());
                    }
                    m13191s(bgVar, bgVar.f14823n);
                    Path path4 = new Path();
                    m13196x(bgVar, new C4740bv(this, c2 + c3, d + f, path4));
                    path.setFillType(m13183k());
                    path.addPath(path4, matrix);
                }
            } else if (axVar instanceof C4775v) {
                C4775v vVar = (C4775v) axVar;
                m13166N(bwVar, vVar);
                if (m13168P() && mo9636i()) {
                    Matrix matrix5 = vVar.f15125e;
                    if (matrix5 != null) {
                        matrix.preConcat(matrix5);
                    }
                    if (vVar instanceof C4703al) {
                        path2 = m13187o((C4703al) vVar);
                    } else if (vVar instanceof C4768o) {
                        path2 = m13184l((C4768o) vVar);
                    } else if (vVar instanceof C4773t) {
                        path2 = m13185m((C4773t) vVar);
                    } else if (vVar instanceof C4701aj) {
                        path2 = m13186n((C4701aj) vVar);
                    }
                    m13191s(vVar, vVar.f14823n);
                    path.setFillType(path2.getFillType());
                    path.addPath(path2, matrix);
                }
            } else {
                m13180e("Invalid %s element found in clipPath definition", axVar.getClass().getSimpleName());
            }
            this.f14913a.restore();
            this.f14916d = (C4741bw) this.f14917e.pop();
        }
    }

    /* renamed from: s */
    private final void m13191s(C4712au auVar, C4766m mVar) {
        String str = this.f14916d.f14886a.f14806x;
        if (str != null) {
            C4715ax c = auVar.f14833t.mo9620c(str);
            if (c == null) {
                m13180e("ClipPath reference '%s' not found", this.f14916d.f14886a.f14806x);
                return;
            }
            C4769p pVar = (C4769p) c;
            if (pVar.f14813i.isEmpty()) {
                this.f14913a.clipRect(0, 0, 0, 0);
                return;
            }
            Boolean bool = pVar.f15112a;
            boolean z = bool == null || bool.booleanValue();
            if (!(auVar instanceof C4776w) || z) {
                this.f14917e.push(this.f14916d);
                this.f14916d = (C4741bw) this.f14916d.clone();
                Matrix matrix = new Matrix();
                if (!z) {
                    Matrix matrix2 = new Matrix();
                    matrix2.preTranslate(mVar.f15101a, mVar.f15102b);
                    matrix2.preScale(mVar.f15103c, mVar.f15104d);
                    this.f14913a.concat(matrix2);
                    Matrix matrix3 = new Matrix();
                    if (matrix2.invert(matrix3)) {
                        matrix.postConcat(matrix3);
                    }
                }
                Matrix matrix4 = pVar.f15126b;
                if (matrix4 != null) {
                    this.f14913a.concat(matrix4);
                    Matrix matrix5 = new Matrix();
                    if (matrix4.invert(matrix5)) {
                        matrix.postConcat(matrix5);
                    }
                }
                this.f14916d = m13188p(pVar);
                m13191s(pVar, pVar.f14823n);
                Path path = new Path();
                for (C4715ax r : pVar.f14813i) {
                    m13190r(r, true, path, new Matrix());
                }
                this.f14913a.clipPath(path);
                this.f14916d = (C4741bw) this.f14917e.pop();
                this.f14913a.concat(matrix);
                return;
            }
            m13181h("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", auVar.getClass().getSimpleName());
        }
    }

    /* renamed from: t */
    private final void m13192t(C4712au auVar) {
        C4716ay ayVar = this.f14916d.f14886a.f14784b;
        if (ayVar instanceof C4696ae) {
            m13193u(true, auVar.f14823n, (C4696ae) ayVar);
        }
        C4716ay ayVar2 = this.f14916d.f14886a.f14786d;
        if (ayVar2 instanceof C4696ae) {
            m13193u(false, auVar.f14823n, (C4696ae) ayVar2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010f  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13193u(boolean r25, com.p232a.p233a.C4766m r26, com.p232a.p233a.C4696ae r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            com.a.a.bp r4 = r0.f14915c
            java.lang.String r5 = r3.f14747a
            com.a.a.ax r4 = r4.mo9620c(r5)
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 != 0) goto L_0x003f
            java.lang.Object[] r2 = new java.lang.Object[r5]
            if (r6 == r1) goto L_0x001c
            java.lang.String r4 = "Stroke"
            goto L_0x001e
        L_0x001c:
            java.lang.String r4 = "Fill"
        L_0x001e:
            r2[r7] = r4
            java.lang.String r4 = r3.f14747a
            r2[r6] = r4
            java.lang.String r4 = "%s reference '%s' not found"
            m13180e(r4, r2)
            com.a.a.ay r2 = r3.f14748b
            if (r2 == 0) goto L_0x0033
            com.a.a.bw r3 = r0.f14916d
            m13178Z(r3, r1, r2)
            return
        L_0x0033:
            if (r1 == 0) goto L_0x003a
            com.a.a.bw r1 = r0.f14916d
            r1.f14887b = r7
            return
        L_0x003a:
            com.a.a.bw r1 = r0.f14916d
            r1.f14888c = r7
            return
        L_0x003f:
            boolean r3 = r4 instanceof com.p232a.p233a.C4714aw
            r8 = 3
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x01b0
            r3 = r4
            com.a.a.aw r3 = (com.p232a.p233a.C4714aw) r3
            java.lang.String r12 = r3.f15123d
            if (r12 == 0) goto L_0x0050
            r0.m13198z(r3, r12)
        L_0x0050:
            java.lang.Boolean r12 = r3.f15121b
            if (r12 == 0) goto L_0x005c
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x005c
            r12 = 1
            goto L_0x005d
        L_0x005c:
            r12 = 0
        L_0x005d:
            if (r1 == 0) goto L_0x0064
            com.a.a.bw r13 = r0.f14916d
            android.graphics.Paint r13 = r13.f14889d
            goto L_0x0068
        L_0x0064:
            com.a.a.bw r13 = r0.f14916d
            android.graphics.Paint r13 = r13.f14890e
        L_0x0068:
            if (r12 == 0) goto L_0x0098
            com.a.a.m r14 = r24.mo9632b()
            com.a.a.z r15 = r3.f14829f
            if (r15 == 0) goto L_0x0077
            float r15 = r15.mo9683c(r0)
            goto L_0x0078
        L_0x0077:
            r15 = 0
        L_0x0078:
            com.a.a.z r9 = r3.f14830g
            if (r9 == 0) goto L_0x0081
            float r9 = r9.mo9684d(r0)
            goto L_0x0082
        L_0x0081:
            r9 = 0
        L_0x0082:
            com.a.a.z r11 = r3.f14831h
            if (r11 == 0) goto L_0x008b
            float r11 = r11.mo9683c(r0)
            goto L_0x008d
        L_0x008b:
            float r11 = r14.f15103c
        L_0x008d:
            com.a.a.z r14 = r3.f14832i
            if (r14 == 0) goto L_0x0096
            float r14 = r14.mo9684d(r0)
            goto L_0x00c0
        L_0x0096:
            r14 = 0
            goto L_0x00c0
        L_0x0098:
            com.a.a.z r9 = r3.f14829f
            if (r9 == 0) goto L_0x00a2
            float r9 = r9.mo9682b(r0, r10)
            r15 = r9
            goto L_0x00a3
        L_0x00a2:
            r15 = 0
        L_0x00a3:
            com.a.a.z r9 = r3.f14830g
            if (r9 == 0) goto L_0x00ac
            float r9 = r9.mo9682b(r0, r10)
            goto L_0x00ad
        L_0x00ac:
            r9 = 0
        L_0x00ad:
            com.a.a.z r11 = r3.f14831h
            if (r11 == 0) goto L_0x00b6
            float r11 = r11.mo9682b(r0, r10)
            goto L_0x00b8
        L_0x00b6:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x00b8:
            com.a.a.z r14 = r3.f14832i
            if (r14 == 0) goto L_0x00c9
            float r14 = r14.mo9682b(r0, r10)
        L_0x00c0:
            r18 = r9
            r19 = r11
            r20 = r14
            r17 = r15
            goto L_0x00d1
        L_0x00c9:
            r18 = r9
            r19 = r11
            r17 = r15
            r20 = 0
        L_0x00d1:
            r24.m13164L()
            com.a.a.bw r9 = r0.m13188p(r3)
            r0.f14916d = r9
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            if (r12 != 0) goto L_0x00ef
            float r11 = r2.f15101a
            float r12 = r2.f15102b
            r9.preTranslate(r11, r12)
            float r11 = r2.f15103c
            float r12 = r2.f15104d
            r9.preScale(r11, r12)
        L_0x00ef:
            android.graphics.Matrix r11 = r3.f15122c
            if (r11 == 0) goto L_0x00f6
            r9.preConcat(r11)
        L_0x00f6:
            java.util.List r11 = r3.f15120a
            int r11 = r11.size()
            if (r11 != 0) goto L_0x010f
            r24.m13163K()
            if (r1 == 0) goto L_0x0109
            com.a.a.bw r3 = r0.f14916d
            r3.f14887b = r7
            goto L_0x01b0
        L_0x0109:
            com.a.a.bw r3 = r0.f14916d
            r3.f14888c = r7
            goto L_0x01b0
        L_0x010f:
            int[] r12 = new int[r11]
            float[] r14 = new float[r11]
            java.util.List r15 = r3.f15120a
            java.util.Iterator r15 = r15.iterator()
            r16 = 0
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x011d:
            boolean r22 = r15.hasNext()
            if (r22 == 0) goto L_0x0173
            java.lang.Object r22 = r15.next()
            com.a.a.ax r22 = (com.p232a.p233a.C4715ax) r22
            r7 = r22
            com.a.a.an r7 = (com.p232a.p233a.C4705an) r7
            java.lang.Float r10 = r7.f14770a
            if (r10 == 0) goto L_0x0136
            float r10 = r10.floatValue()
            goto L_0x0137
        L_0x0136:
            r10 = 0
        L_0x0137:
            if (r16 == 0) goto L_0x0141
            int r22 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r22 < 0) goto L_0x013e
            goto L_0x0141
        L_0x013e:
            r14[r16] = r21
            goto L_0x0145
        L_0x0141:
            r14[r16] = r10
            r21 = r10
        L_0x0145:
            r24.m13164L()
            com.a.a.bw r10 = r0.f14916d
            r0.m13166N(r10, r7)
            com.a.a.bw r7 = r0.f14916d
            com.a.a.ao r7 = r7.f14886a
            com.a.a.ay r10 = r7.f14804v
            com.a.a.q r10 = (com.p232a.p233a.C4770q) r10
            if (r10 != 0) goto L_0x0159
            com.a.a.q r10 = com.p232a.p233a.C4770q.f15113a
        L_0x0159:
            java.lang.Float r7 = r7.f14805w
            float r7 = r7.floatValue()
            int r7 = m13174V(r7)
            int r7 = r7 << 24
            int r10 = r10.f15114b
            r7 = r7 | r10
            r12[r16] = r7
            int r16 = r16 + 1
            r24.m13163K()
            r7 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x011d
        L_0x0173:
            int r7 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r7 != 0) goto L_0x017b
            int r7 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x017d
        L_0x017b:
            if (r11 != r6) goto L_0x0188
        L_0x017d:
            r24.m13163K()
            int r11 = r11 + -1
            r3 = r12[r11]
            r13.setColor(r3)
            goto L_0x01b0
        L_0x0188:
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.CLAMP
            int r3 = r3.f15124e
            if (r3 == 0) goto L_0x019a
            if (r3 != r5) goto L_0x0195
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.MIRROR
        L_0x0192:
            r23 = r3
            goto L_0x019c
        L_0x0195:
            if (r3 != r8) goto L_0x019a
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x0192
        L_0x019a:
            r23 = r7
        L_0x019c:
            r24.m13163K()
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            r16 = r3
            r21 = r12
            r22 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r3.setLocalMatrix(r9)
            r13.setShader(r3)
        L_0x01b0:
            boolean r3 = r4 instanceof com.p232a.p233a.C4719ba
            if (r3 == 0) goto L_0x0317
            r3 = r4
            com.a.a.ba r3 = (com.p232a.p233a.C4719ba) r3
            java.lang.String r7 = r3.f15123d
            if (r7 == 0) goto L_0x01be
            r0.m13198z(r3, r7)
        L_0x01be:
            java.lang.Boolean r7 = r3.f15121b
            if (r7 == 0) goto L_0x01ca
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x01ca
            r7 = 1
            goto L_0x01cb
        L_0x01ca:
            r7 = 0
        L_0x01cb:
            if (r1 == 0) goto L_0x01d2
            com.a.a.bw r9 = r0.f14916d
            android.graphics.Paint r9 = r9.f14889d
            goto L_0x01d6
        L_0x01d2:
            com.a.a.bw r9 = r0.f14916d
            android.graphics.Paint r9 = r9.f14890e
        L_0x01d6:
            if (r7 == 0) goto L_0x020f
            com.a.a.z r10 = new com.a.a.z
            r11 = 1112014848(0x42480000, float:50.0)
            r12 = 9
            r10.<init>(r11, r12)
            com.a.a.z r11 = r3.f14836f
            if (r11 == 0) goto L_0x01ea
            float r11 = r11.mo9683c(r0)
            goto L_0x01ee
        L_0x01ea:
            float r11 = r10.mo9683c(r0)
        L_0x01ee:
            com.a.a.z r12 = r3.f14837g
            if (r12 == 0) goto L_0x01f7
            float r12 = r12.mo9684d(r0)
            goto L_0x01fb
        L_0x01f7:
            float r12 = r10.mo9684d(r0)
        L_0x01fb:
            com.a.a.z r13 = r3.f14838h
            if (r13 == 0) goto L_0x0204
            float r10 = r13.mo9681a(r0)
            goto L_0x0208
        L_0x0204:
            float r10 = r10.mo9681a(r0)
        L_0x0208:
            r19 = r10
            r17 = r11
            r18 = r12
            goto L_0x0240
        L_0x020f:
            com.a.a.z r10 = r3.f14836f
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r10 == 0) goto L_0x021c
            r12 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10.mo9682b(r0, r12)
            goto L_0x0220
        L_0x021c:
            r12 = 1065353216(0x3f800000, float:1.0)
            r10 = 1056964608(0x3f000000, float:0.5)
        L_0x0220:
            com.a.a.z r13 = r3.f14837g
            if (r13 == 0) goto L_0x0229
            float r13 = r13.mo9682b(r0, r12)
            goto L_0x022b
        L_0x0229:
            r13 = 1056964608(0x3f000000, float:0.5)
        L_0x022b:
            com.a.a.z r14 = r3.f14838h
            if (r14 == 0) goto L_0x023a
            float r11 = r14.mo9682b(r0, r12)
            r17 = r10
            r19 = r11
            r18 = r13
            goto L_0x0240
        L_0x023a:
            r17 = r10
            r18 = r13
            r19 = 1056964608(0x3f000000, float:0.5)
        L_0x0240:
            r24.m13164L()
            com.a.a.bw r10 = r0.m13188p(r3)
            r0.f14916d = r10
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            if (r7 != 0) goto L_0x025e
            float r7 = r2.f15101a
            float r11 = r2.f15102b
            r10.preTranslate(r7, r11)
            float r7 = r2.f15103c
            float r2 = r2.f15104d
            r10.preScale(r7, r2)
        L_0x025e:
            android.graphics.Matrix r2 = r3.f15122c
            if (r2 == 0) goto L_0x0265
            r10.preConcat(r2)
        L_0x0265:
            java.util.List r2 = r3.f15120a
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0280
            r24.m13163K()
            if (r1 == 0) goto L_0x0279
            com.a.a.bw r2 = r0.f14916d
            r3 = 0
            r2.f14887b = r3
            goto L_0x0317
        L_0x0279:
            r3 = 0
            com.a.a.bw r2 = r0.f14916d
            r2.f14888c = r3
            goto L_0x0317
        L_0x0280:
            int[] r7 = new int[r2]
            float[] r11 = new float[r2]
            java.util.List r12 = r3.f15120a
            java.util.Iterator r12 = r12.iterator()
            r13 = 0
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x028d:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x02de
            java.lang.Object r15 = r12.next()
            com.a.a.ax r15 = (com.p232a.p233a.C4715ax) r15
            com.a.a.an r15 = (com.p232a.p233a.C4705an) r15
            java.lang.Float r8 = r15.f14770a
            if (r8 == 0) goto L_0x02a4
            float r8 = r8.floatValue()
            goto L_0x02a5
        L_0x02a4:
            r8 = 0
        L_0x02a5:
            if (r13 == 0) goto L_0x02af
            int r16 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x02ac
            goto L_0x02af
        L_0x02ac:
            r11[r13] = r14
            goto L_0x02b2
        L_0x02af:
            r11[r13] = r8
            r14 = r8
        L_0x02b2:
            r24.m13164L()
            com.a.a.bw r8 = r0.f14916d
            r0.m13166N(r8, r15)
            com.a.a.bw r8 = r0.f14916d
            com.a.a.ao r8 = r8.f14886a
            com.a.a.ay r15 = r8.f14804v
            com.a.a.q r15 = (com.p232a.p233a.C4770q) r15
            if (r15 != 0) goto L_0x02c6
            com.a.a.q r15 = com.p232a.p233a.C4770q.f15113a
        L_0x02c6:
            java.lang.Float r8 = r8.f14805w
            float r8 = r8.floatValue()
            int r8 = m13174V(r8)
            int r8 = r8 << 24
            int r15 = r15.f15114b
            r8 = r8 | r15
            r7[r13] = r8
            int r13 = r13 + 1
            r24.m13163K()
            r8 = 3
            goto L_0x028d
        L_0x02de:
            r8 = 0
            int r8 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x030d
            if (r2 != r6) goto L_0x02e6
            goto L_0x030d
        L_0x02e6:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            int r3 = r3.f15124e
            if (r3 == 0) goto L_0x02f6
            if (r3 != r5) goto L_0x02f1
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x02f6
        L_0x02f1:
            r5 = 3
            if (r3 != r5) goto L_0x02f6
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
        L_0x02f6:
            r22 = r2
            r24.m13163K()
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            r16 = r2
            r20 = r7
            r21 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.setLocalMatrix(r10)
            r9.setShader(r2)
            goto L_0x0317
        L_0x030d:
            r24.m13163K()
            int r2 = r2 + -1
            r2 = r7[r2]
            r9.setColor(r2)
        L_0x0317:
            boolean r2 = r4 instanceof com.p232a.p233a.C4704am
            if (r2 == 0) goto L_0x03a7
            com.a.a.am r4 = (com.p232a.p233a.C4704am) r4
            r2 = 6442450944(0x180000000, double:3.1829936864E-314)
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            r9 = 2147483648(0x80000000, double:1.0609978955E-314)
            if (r1 == 0) goto L_0x036b
            com.a.a.ao r1 = r4.f14826q
            boolean r1 = m13176X(r1, r9)
            if (r1 == 0) goto L_0x0347
            com.a.a.bw r1 = r0.f14916d
            com.a.a.ao r5 = r1.f14886a
            com.a.a.ao r9 = r4.f14826q
            com.a.a.ay r9 = r9.f14808z
            r5.f14784b = r9
            if (r9 == 0) goto L_0x0344
            r5 = 1
            goto L_0x0345
        L_0x0344:
            r5 = 0
        L_0x0345:
            r1.f14887b = r5
        L_0x0347:
            com.a.a.ao r1 = r4.f14826q
            boolean r1 = m13176X(r1, r7)
            if (r1 == 0) goto L_0x0359
            com.a.a.bw r1 = r0.f14916d
            com.a.a.ao r1 = r1.f14886a
            com.a.a.ao r5 = r4.f14826q
            java.lang.Float r5 = r5.f14771A
            r1.f14785c = r5
        L_0x0359:
            com.a.a.ao r1 = r4.f14826q
            boolean r1 = m13176X(r1, r2)
            if (r1 == 0) goto L_0x03a7
            com.a.a.bw r1 = r0.f14916d
            com.a.a.ao r2 = r1.f14886a
            com.a.a.ay r2 = r2.f14784b
            m13178Z(r1, r6, r2)
            return
        L_0x036b:
            com.a.a.ao r1 = r4.f14826q
            boolean r1 = m13176X(r1, r9)
            if (r1 == 0) goto L_0x0383
            com.a.a.bw r1 = r0.f14916d
            com.a.a.ao r5 = r1.f14886a
            com.a.a.ao r9 = r4.f14826q
            com.a.a.ay r9 = r9.f14808z
            r5.f14786d = r9
            if (r9 == 0) goto L_0x0380
            goto L_0x0381
        L_0x0380:
            r6 = 0
        L_0x0381:
            r1.f14888c = r6
        L_0x0383:
            com.a.a.ao r1 = r4.f14826q
            boolean r1 = m13176X(r1, r7)
            if (r1 == 0) goto L_0x0395
            com.a.a.bw r1 = r0.f14916d
            com.a.a.ao r1 = r1.f14886a
            com.a.a.ao r5 = r4.f14826q
            java.lang.Float r5 = r5.f14771A
            r1.f14787e = r5
        L_0x0395:
            com.a.a.ao r1 = r4.f14826q
            boolean r1 = m13176X(r1, r2)
            if (r1 == 0) goto L_0x03a7
            com.a.a.bw r1 = r0.f14916d
            com.a.a.ao r2 = r1.f14886a
            com.a.a.ay r2 = r2.f14786d
            r3 = 0
            m13178Z(r1, r3, r2)
        L_0x03a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p232a.p233a.C4746ca.m13193u(boolean, com.a.a.m, com.a.a.ae):void");
    }

    /* renamed from: v */
    private final void m13194v(C4712au auVar, Path path) {
        float f;
        float f2;
        float f3;
        float f4;
        C4712au auVar2 = auVar;
        Path path2 = path;
        C4716ay ayVar = this.f14916d.f14886a.f14784b;
        if (ayVar instanceof C4696ae) {
            C4715ax c = this.f14915c.mo9620c(((C4696ae) ayVar).f14747a);
            if (c instanceof C4700ai) {
                C4700ai aiVar = (C4700ai) c;
                Boolean bool = aiVar.f14755a;
                boolean z = bool != null && bool.booleanValue();
                String str = aiVar.f14762h;
                if (str != null) {
                    m13153A(aiVar, str);
                }
                if (z) {
                    C4779z zVar = aiVar.f14758d;
                    f4 = zVar != null ? zVar.mo9683c(this) : 0.0f;
                    C4779z zVar2 = aiVar.f14759e;
                    f3 = zVar2 != null ? zVar2.mo9684d(this) : 0.0f;
                    C4779z zVar3 = aiVar.f14760f;
                    f2 = zVar3 != null ? zVar3.mo9683c(this) : 0.0f;
                    C4779z zVar4 = aiVar.f14761g;
                    f = zVar4 != null ? zVar4.mo9684d(this) : 0.0f;
                } else {
                    C4779z zVar5 = aiVar.f14758d;
                    float b = zVar5 != null ? zVar5.mo9682b(this, 1.0f) : 0.0f;
                    C4779z zVar6 = aiVar.f14759e;
                    float b2 = zVar6 != null ? zVar6.mo9682b(this, 1.0f) : 0.0f;
                    C4779z zVar7 = aiVar.f14760f;
                    float b3 = zVar7 != null ? zVar7.mo9682b(this, 1.0f) : 0.0f;
                    C4779z zVar8 = aiVar.f14761g;
                    float b4 = zVar8 != null ? zVar8.mo9682b(this, 1.0f) : 0.0f;
                    C4766m mVar = auVar2.f14823n;
                    float f5 = mVar.f15101a;
                    float f6 = mVar.f15103c;
                    f4 = (b * f6) + f5;
                    float f7 = mVar.f15102b;
                    float f8 = mVar.f15104d;
                    float f9 = b3 * f6;
                    f = b4 * f8;
                    f3 = (b2 * f8) + f7;
                    f2 = f9;
                }
                if (f2 != 0.0f && f != 0.0f) {
                    C4765l lVar = aiVar.f14835v;
                    if (lVar == null) {
                        lVar = C4765l.f15098b;
                    }
                    m13164L();
                    this.f14913a.clipPath(path2);
                    C4741bw bwVar = new C4741bw();
                    mo9635g(bwVar, C4706ao.m13074a());
                    bwVar.f14886a.f14797o = false;
                    m13175W(aiVar, bwVar);
                    this.f14916d = bwVar;
                    C4766m mVar2 = auVar2.f14823n;
                    Matrix matrix = aiVar.f14757c;
                    if (matrix != null) {
                        this.f14913a.concat(matrix);
                        Matrix matrix2 = new Matrix();
                        if (aiVar.f14757c.invert(matrix2)) {
                            C4766m mVar3 = auVar2.f14823n;
                            float f10 = mVar3.f15101a;
                            float f11 = mVar3.f15102b;
                            float f12 = mVar3.f15103c + f10;
                            float f13 = f11 + mVar3.f15104d;
                            float[] fArr = {f10, f11, f12, f11, f12, f13, f10, f13};
                            matrix2.mapPoints(fArr);
                            float f14 = fArr[0];
                            float f15 = fArr[1];
                            RectF rectF = new RectF(f14, f15, f14, f15);
                            for (int i = 2; i <= 6; i += 2) {
                                if (fArr[i] < rectF.left) {
                                    rectF.left = fArr[i];
                                }
                                if (fArr[i] > rectF.right) {
                                    rectF.right = fArr[i];
                                }
                                int i2 = i + 1;
                                if (fArr[i2] < rectF.top) {
                                    rectF.top = fArr[i2];
                                }
                                if (fArr[i2] > rectF.bottom) {
                                    rectF.bottom = fArr[i2];
                                }
                            }
                            mVar2 = new C4766m(rectF.left, rectF.top, rectF.right - rectF.left, rectF.bottom - rectF.top);
                        }
                    }
                    float floor = f4 + (((float) Math.floor((double) ((mVar2.f15101a - f4) / f2))) * f2);
                    float f16 = mVar2.f15101a + mVar2.f15103c;
                    float f17 = mVar2.f15102b + mVar2.f15104d;
                    C4766m mVar4 = new C4766m(0.0f, 0.0f, f2, f);
                    for (float floor2 = f3 + (((float) Math.floor((double) ((mVar2.f15102b - f3) / f))) * f); floor2 < f17; floor2 += f) {
                        for (float f18 = floor; f18 < f16; f18 += f2) {
                            mVar4.f15101a = f18;
                            mVar4.f15102b = floor2;
                            m13164L();
                            if (!this.f14916d.f14886a.f14797o.booleanValue()) {
                                m13162J(mVar4.f15101a, mVar4.f15102b, mVar4.f15103c, mVar4.f15104d);
                            }
                            C4766m mVar5 = aiVar.f14841w;
                            if (mVar5 != null) {
                                this.f14913a.concat(m13172T(mVar4, mVar5, lVar));
                            } else {
                                Boolean bool2 = aiVar.f14756b;
                                boolean z2 = bool2 == null || bool2.booleanValue();
                                this.f14913a.translate(f18, floor2);
                                if (!z2) {
                                    Canvas canvas = this.f14913a;
                                    C4766m mVar6 = auVar2.f14823n;
                                    canvas.scale(mVar6.f15103c, mVar6.f15104d);
                                }
                            }
                            boolean Q = m13169Q();
                            for (C4715ax E : aiVar.f14813i) {
                                m13157E(E);
                            }
                            if (Q) {
                                m13177Y();
                            }
                            m13163K();
                        }
                    }
                    m13163K();
                    return;
                }
                return;
            }
        }
        this.f14913a.drawPath(path2, this.f14916d.f14889d);
    }

    /* renamed from: w */
    private final void m13195w(Path path) {
        C4741bw bwVar = this.f14916d;
        if (bwVar.f14886a.f14782L == 2) {
            Matrix matrix = this.f14913a.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.f14913a.setMatrix(new Matrix());
            Shader shader = this.f14916d.f14890e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.f14913a.drawPath(path2, this.f14916d.f14890e);
            this.f14913a.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.f14913a.drawPath(path, bwVar.f14890e);
    }

    /* renamed from: x */
    private final void m13196x(C4727bi biVar, C4743by byVar) {
        float f;
        float f2;
        float f3;
        if (m13168P()) {
            Iterator it = biVar.f14813i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                C4715ax axVar = (C4715ax) it.next();
                if (axVar instanceof C4730bl) {
                    byVar.mo9628a(m13189q(((C4730bl) axVar).f14853a, z, !it.hasNext()));
                } else if (byVar.mo9629b((C4727bi) axVar)) {
                    float f4 = 0.0f;
                    if (axVar instanceof C4728bj) {
                        m13164L();
                        C4728bj bjVar = (C4728bj) axVar;
                        m13166N(this.f14916d, bjVar);
                        if (m13168P() && mo9636i()) {
                            C4715ax c = bjVar.f14833t.mo9620c(bjVar.f14846a);
                            if (c == null) {
                                m13180e("TextPath reference '%s' not found", bjVar.f14846a);
                            } else {
                                C4697af afVar = (C4697af) c;
                                Path path = new C4737bs(afVar.f14749a).f14874a;
                                Matrix matrix = afVar.f15125e;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                C4779z zVar = bjVar.f14847b;
                                if (zVar != null) {
                                    f4 = zVar.mo9682b(this, pathMeasure.getLength());
                                }
                                int R = m13170R();
                                if (R != 1) {
                                    float j = m13182j(bjVar);
                                    if (R == 2) {
                                        j /= 2.0f;
                                    }
                                    f4 -= j;
                                }
                                m13192t(bjVar.f14848c);
                                boolean Q = m13169Q();
                                m13196x(bjVar, new C4738bt(this, path, f4));
                                if (Q) {
                                    m13177Y();
                                }
                            }
                        }
                        m13163K();
                    } else if (axVar instanceof C4724bf) {
                        m13164L();
                        C4724bf bfVar = (C4724bf) axVar;
                        m13166N(this.f14916d, bfVar);
                        if (m13168P()) {
                            boolean z2 = byVar instanceof C4739bu;
                            if (z2) {
                                List list = bfVar.f14849b;
                                float c2 = (list == null || list.size() == 0) ? ((C4739bu) byVar).f14879b : ((C4779z) bfVar.f14849b.get(0)).mo9683c(this);
                                List list2 = bfVar.f14850c;
                                f2 = (list2 == null || list2.size() == 0) ? ((C4739bu) byVar).f14880c : ((C4779z) bfVar.f14850c.get(0)).mo9684d(this);
                                List list3 = bfVar.f14851d;
                                f = (list3 == null || list3.size() == 0) ? 0.0f : ((C4779z) bfVar.f14851d.get(0)).mo9683c(this);
                                List list4 = bfVar.f14852e;
                                if (!(list4 == null || list4.size() == 0)) {
                                    f4 = ((C4779z) bfVar.f14852e.get(0)).mo9684d(this);
                                }
                                float f5 = c2;
                                f3 = f4;
                                f4 = f5;
                            } else {
                                f3 = 0.0f;
                                f2 = 0.0f;
                                f = 0.0f;
                            }
                            m13192t(bfVar.f14844a);
                            if (z2) {
                                C4739bu buVar = (C4739bu) byVar;
                                buVar.f14879b = f4 + f;
                                buVar.f14880c = f2 + f3;
                            }
                            boolean Q2 = m13169Q();
                            m13196x(bfVar, byVar);
                            if (Q2) {
                                m13177Y();
                            }
                        }
                        m13163K();
                    } else if (axVar instanceof C4723be) {
                        m13164L();
                        C4723be beVar = (C4723be) axVar;
                        m13166N(this.f14916d, beVar);
                        if (m13168P()) {
                            m13192t(beVar.f14843b);
                            C4715ax c3 = axVar.f14833t.mo9620c(beVar.f14842a);
                            if (c3 == null || !(c3 instanceof C4727bi)) {
                                m13180e("Tref reference '%s' not found", beVar.f14842a);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                m13197y((C4727bi) c3, sb);
                                if (sb.length() > 0) {
                                    byVar.mo9628a(sb.toString());
                                }
                            }
                        }
                        m13163K();
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: y */
    private final void m13197y(C4727bi biVar, StringBuilder sb) {
        Iterator it = biVar.f14813i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C4715ax axVar = (C4715ax) it.next();
            if (axVar instanceof C4727bi) {
                m13197y((C4727bi) axVar, sb);
            } else if (axVar instanceof C4730bl) {
                sb.append(m13189q(((C4730bl) axVar).f14853a, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* renamed from: z */
    private final void m13198z(C4774u uVar, String str) {
        C4715ax c = uVar.f14833t.mo9620c(str);
        if (c == null) {
            m13181h("Gradient reference '%s' not found", str);
        } else if (!(c instanceof C4774u)) {
            m13180e("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (c == uVar) {
            m13180e("Circular reference in gradient href attribute '%s'", str);
        } else {
            C4774u uVar2 = (C4774u) c;
            if (uVar.f15121b == null) {
                uVar.f15121b = uVar2.f15121b;
            }
            if (uVar.f15122c == null) {
                uVar.f15122c = uVar2.f15122c;
            }
            if (uVar.f15124e == 0) {
                uVar.f15124e = uVar2.f15124e;
            }
            if (uVar.f15120a.isEmpty()) {
                uVar.f15120a = uVar2.f15120a;
            }
            try {
                if (uVar instanceof C4714aw) {
                    C4714aw awVar = (C4714aw) uVar;
                    C4714aw awVar2 = (C4714aw) c;
                    if (awVar.f14829f == null) {
                        awVar.f14829f = awVar2.f14829f;
                    }
                    if (awVar.f14830g == null) {
                        awVar.f14830g = awVar2.f14830g;
                    }
                    if (awVar.f14831h == null) {
                        awVar.f14831h = awVar2.f14831h;
                    }
                    if (awVar.f14832i == null) {
                        awVar.f14832i = awVar2.f14832i;
                    }
                } else {
                    C4719ba baVar = (C4719ba) uVar;
                    C4719ba baVar2 = (C4719ba) c;
                    if (baVar.f14836f == null) {
                        baVar.f14836f = baVar2.f14836f;
                    }
                    if (baVar.f14837g == null) {
                        baVar.f14837g = baVar2.f14837g;
                    }
                    if (baVar.f14838h == null) {
                        baVar.f14838h = baVar2.f14838h;
                    }
                    if (baVar.f14839i == null) {
                        baVar.f14839i = baVar2.f14839i;
                    }
                    if (baVar.f14840j == null) {
                        baVar.f14840j = baVar2.f14840j;
                    }
                }
            } catch (ClassCastException unused) {
            }
            String str2 = uVar2.f15123d;
            if (str2 != null) {
                m13198z(uVar, str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo9631a() {
        return this.f14916d.f14889d.getTextSize();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C4766m mo9632b() {
        C4741bw bwVar = this.f14916d;
        C4766m mVar = bwVar.f14892g;
        if (mVar != null) {
            return mVar;
        }
        return bwVar.f14891f;
    }

    /* renamed from: d */
    public final void mo9633d(C4715ax axVar) {
        Boolean bool;
        if ((axVar instanceof C4713av) && (bool = ((C4713av) axVar).f14825p) != null) {
            this.f14916d.f14893h = bool.booleanValue();
        }
    }

    /* renamed from: f */
    public final void mo9634f(C4707ap apVar, C4779z zVar, C4779z zVar2, C4766m mVar, C4765l lVar) {
        float f;
        if (zVar != null && zVar.mo9686f()) {
            return;
        }
        if (zVar2 == null || !zVar2.mo9686f()) {
            if (lVar == null && (lVar = apVar.f14835v) == null) {
                lVar = C4765l.f15098b;
            }
            m13166N(this.f14916d, apVar);
            if (m13168P()) {
                float f2 = 0.0f;
                if (apVar.f14834u != null) {
                    C4779z zVar3 = apVar.f14809a;
                    float c = zVar3 != null ? zVar3.mo9683c(this) : 0.0f;
                    C4779z zVar4 = apVar.f14810b;
                    if (zVar4 != null) {
                        f2 = zVar4.mo9684d(this);
                    }
                    float f3 = f2;
                    f2 = c;
                    f = f3;
                } else {
                    f = 0.0f;
                }
                C4766m b = mo9632b();
                float c2 = zVar != null ? zVar.mo9683c(this) : b.f15103c;
                float d = zVar2 != null ? zVar2.mo9684d(this) : b.f15104d;
                C4741bw bwVar = this.f14916d;
                bwVar.f14891f = new C4766m(f2, f, c2, d);
                if (!bwVar.f14886a.f14797o.booleanValue()) {
                    C4766m mVar2 = this.f14916d.f14891f;
                    m13162J(mVar2.f15101a, mVar2.f15102b, mVar2.f15103c, mVar2.f15104d);
                }
                m13191s(apVar, this.f14916d.f14891f);
                if (mVar != null) {
                    this.f14913a.concat(m13172T(this.f14916d.f14891f, mVar, lVar));
                    this.f14916d.f14892g = apVar.f14841w;
                } else {
                    this.f14913a.translate(f2, f);
                }
                boolean Q = m13169Q();
                m13167O();
                m13159G(apVar, true);
                if (Q) {
                    m13177Y();
                }
                m13165M(apVar);
            }
        }
    }

    /* renamed from: g */
    public final void mo9635g(C4741bw bwVar, C4706ao aoVar) {
        if (m13176X(aoVar, 4096)) {
            bwVar.f14886a.f14793k = aoVar.f14793k;
        }
        if (m13176X(aoVar, 2048)) {
            bwVar.f14886a.f14792j = aoVar.f14792j;
        }
        boolean z = false;
        if (m13176X(aoVar, 1)) {
            bwVar.f14886a.f14784b = aoVar.f14784b;
            bwVar.f14887b = aoVar.f14784b != null;
        }
        if (m13176X(aoVar, 4)) {
            bwVar.f14886a.f14785c = aoVar.f14785c;
        }
        if (m13176X(aoVar, 6149)) {
            m13178Z(bwVar, true, bwVar.f14886a.f14784b);
        }
        if (m13176X(aoVar, 2)) {
            bwVar.f14886a.f14774D = aoVar.f14774D;
        }
        if (m13176X(aoVar, 8)) {
            bwVar.f14886a.f14786d = aoVar.f14786d;
            bwVar.f14888c = aoVar.f14786d != null;
        }
        if (m13176X(aoVar, 16)) {
            bwVar.f14886a.f14787e = aoVar.f14787e;
        }
        if (m13176X(aoVar, 6168)) {
            m13178Z(bwVar, false, bwVar.f14886a.f14786d);
        }
        if (m13176X(aoVar, 34359738368L)) {
            bwVar.f14886a.f14782L = aoVar.f14782L;
        }
        if (m13176X(aoVar, 32)) {
            C4706ao aoVar2 = bwVar.f14886a;
            aoVar2.f14788f = aoVar.f14788f;
            bwVar.f14890e.setStrokeWidth(aoVar2.f14788f.mo9681a(this));
        }
        Typeface typeface = null;
        if (m13176X(aoVar, 64)) {
            bwVar.f14886a.f14775E = aoVar.f14775E;
            C4764k kVar = C4764k.None;
            int i = aoVar.f14775E;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                bwVar.f14890e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i2 == 1) {
                bwVar.f14890e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i2 == 2) {
                bwVar.f14890e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m13176X(aoVar, 128)) {
            bwVar.f14886a.f14776F = aoVar.f14776F;
            C4764k kVar2 = C4764k.None;
            int i3 = aoVar.f14776F;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 == 0) {
                bwVar.f14890e.setStrokeJoin(Paint.Join.MITER);
            } else if (i4 == 1) {
                bwVar.f14890e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i4 == 2) {
                bwVar.f14890e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m13176X(aoVar, 256)) {
            bwVar.f14886a.f14789g = aoVar.f14789g;
            bwVar.f14890e.setStrokeMiter(aoVar.f14789g.floatValue());
        }
        if (m13176X(aoVar, 512)) {
            bwVar.f14886a.f14790h = aoVar.f14790h;
        }
        if (m13176X(aoVar, 1024)) {
            bwVar.f14886a.f14791i = aoVar.f14791i;
        }
        if (m13176X(aoVar, 1536)) {
            C4779z[] zVarArr = bwVar.f14886a.f14790h;
            if (zVarArr == null) {
                bwVar.f14890e.setPathEffect((PathEffect) null);
            } else {
                int length = zVarArr.length;
                int i5 = (length & 1) == 0 ? length : length + length;
                float[] fArr = new float[i5];
                float f = 0.0f;
                for (int i6 = 0; i6 < i5; i6++) {
                    float a = bwVar.f14886a.f14790h[i6 % length].mo9681a(this);
                    fArr[i6] = a;
                    f += a;
                }
                if (f == 0.0f) {
                    bwVar.f14890e.setPathEffect((PathEffect) null);
                } else {
                    float a2 = bwVar.f14886a.f14791i.mo9681a(this);
                    if (a2 < 0.0f) {
                        a2 = (a2 % f) + f;
                    }
                    bwVar.f14890e.setPathEffect(new DashPathEffect(fArr, a2));
                }
            }
        }
        if (m13176X(aoVar, 16384)) {
            float a3 = mo9631a();
            bwVar.f14886a.f14795m = aoVar.f14795m;
            bwVar.f14889d.setTextSize(aoVar.f14795m.mo9682b(this, a3));
            bwVar.f14890e.setTextSize(aoVar.f14795m.mo9682b(this, a3));
        }
        if (m13176X(aoVar, 8192)) {
            bwVar.f14886a.f14794l = aoVar.f14794l;
        }
        if (m13176X(aoVar, 32768)) {
            if (aoVar.f14796n.intValue() == -1 && bwVar.f14886a.f14796n.intValue() > 100) {
                C4706ao aoVar3 = bwVar.f14886a;
                aoVar3.f14796n = Integer.valueOf(aoVar3.f14796n.intValue() - 100);
            } else if (aoVar.f14796n.intValue() != 1 || bwVar.f14886a.f14796n.intValue() >= 900) {
                bwVar.f14886a.f14796n = aoVar.f14796n;
            } else {
                C4706ao aoVar4 = bwVar.f14886a;
                aoVar4.f14796n = Integer.valueOf(aoVar4.f14796n.intValue() + 100);
            }
        }
        if (m13176X(aoVar, 65536)) {
            bwVar.f14886a.f14777G = aoVar.f14777G;
        }
        if (m13176X(aoVar, 106496)) {
            List<String> list = bwVar.f14886a.f14794l;
            if (list != null && this.f14915c != null) {
                for (String U : list) {
                    C4706ao aoVar5 = bwVar.f14886a;
                    typeface = m13173U(U, aoVar5.f14796n, aoVar5.f14777G);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                C4706ao aoVar6 = bwVar.f14886a;
                typeface = m13173U("sans-serif", aoVar6.f14796n, aoVar6.f14777G);
            }
            bwVar.f14889d.setTypeface(typeface);
            bwVar.f14890e.setTypeface(typeface);
        }
        if (m13176X(aoVar, 131072)) {
            bwVar.f14886a.f14778H = aoVar.f14778H;
            bwVar.f14889d.setStrikeThruText(aoVar.f14778H == 4);
            bwVar.f14889d.setUnderlineText(aoVar.f14778H == 2);
            bwVar.f14890e.setStrikeThruText(aoVar.f14778H == 4);
            Paint paint = bwVar.f14890e;
            if (aoVar.f14778H == 2) {
                z = true;
            }
            paint.setUnderlineText(z);
        }
        if (m13176X(aoVar, 68719476736L)) {
            bwVar.f14886a.f14779I = aoVar.f14779I;
        }
        if (m13176X(aoVar, 262144)) {
            bwVar.f14886a.f14780J = aoVar.f14780J;
        }
        if (m13176X(aoVar, 524288)) {
            bwVar.f14886a.f14797o = aoVar.f14797o;
        }
        if (m13176X(aoVar, 2097152)) {
            bwVar.f14886a.f14799q = aoVar.f14799q;
        }
        if (m13176X(aoVar, 4194304)) {
            bwVar.f14886a.f14800r = aoVar.f14800r;
        }
        if (m13176X(aoVar, 8388608)) {
            bwVar.f14886a.f14801s = aoVar.f14801s;
        }
        if (m13176X(aoVar, 16777216)) {
            bwVar.f14886a.f14802t = aoVar.f14802t;
        }
        if (m13176X(aoVar, 33554432)) {
            bwVar.f14886a.f14803u = aoVar.f14803u;
        }
        if (m13176X(aoVar, 1048576)) {
            bwVar.f14886a.f14798p = aoVar.f14798p;
        }
        if (m13176X(aoVar, 268435456)) {
            bwVar.f14886a.f14806x = aoVar.f14806x;
        }
        if (m13176X(aoVar, 536870912)) {
            bwVar.f14886a.f14781K = aoVar.f14781K;
        }
        if (m13176X(aoVar, 1073741824)) {
            bwVar.f14886a.f14807y = aoVar.f14807y;
        }
        if (m13176X(aoVar, 67108864)) {
            bwVar.f14886a.f14804v = aoVar.f14804v;
        }
        if (m13176X(aoVar, 134217728)) {
            bwVar.f14886a.f14805w = aoVar.f14805w;
        }
        if (m13176X(aoVar, 8589934592L)) {
            bwVar.f14886a.f14772B = aoVar.f14772B;
        }
        if (m13176X(aoVar, 17179869184L)) {
            bwVar.f14886a.f14773C = aoVar.f14773C;
        }
    }

    /* renamed from: i */
    public final boolean mo9636i() {
        Boolean bool = this.f14916d.f14886a.f14803u;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: c */
    public static void m13179c(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, C4699ah ahVar) {
        C4699ah ahVar2;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12 = f5;
        boolean z3 = z2;
        float f13 = f6;
        float f14 = f7;
        if (f != f13 || f2 != f14) {
            if (f3 == 0.0f) {
                f8 = f13;
                ahVar2 = ahVar;
            } else if (f4 == 0.0f) {
                ahVar2 = ahVar;
                f8 = f13;
            } else {
                float abs = Math.abs(f3);
                float abs2 = Math.abs(f4);
                double d = (double) f12;
                Double.isNaN(d);
                double radians = (double) ((float) Math.toRadians(d % 360.0d));
                float cos = (float) Math.cos(radians);
                float sin = (float) Math.sin(radians);
                float f15 = (f - f13) / 2.0f;
                float f16 = (f2 - f14) / 2.0f;
                float f17 = (cos * f15) + (sin * f16);
                float f18 = ((-sin) * f15) + (f16 * cos);
                float f19 = abs * abs;
                float f20 = abs2 * abs2;
                float f21 = f17 * f17;
                float f22 = f18 * f18;
                float f23 = (f21 / f19) + (f22 / f20);
                if (f23 > 1.0f) {
                    double d2 = (double) f23;
                    f9 = sin;
                    abs *= (float) Math.sqrt(d2);
                    abs2 *= (float) Math.sqrt(d2);
                    f19 = abs * abs;
                    f20 = abs2 * abs2;
                } else {
                    f9 = sin;
                }
                float f24 = -1.0f;
                float f25 = z == z3 ? -1.0f : 1.0f;
                float f26 = f22 * f19;
                float f27 = f21 * f20;
                float f28 = (((f19 * f20) - f26) - f27) / (f26 + f27);
                if (f28 < 0.0f) {
                    f28 = 0.0f;
                }
                double d3 = (double) f25;
                double sqrt = Math.sqrt((double) f28);
                Double.isNaN(d3);
                float f29 = (float) (d3 * sqrt);
                float f30 = ((abs * f18) / abs2) * f29;
                float f31 = f29 * (-((abs2 * f17) / abs));
                float f32 = ((f + f13) / 2.0f) + ((cos * f30) - (f9 * f31));
                float f33 = ((f2 + f14) / 2.0f) + (f9 * f30) + (cos * f31);
                float f34 = (f17 - f30) / abs;
                float f35 = (f18 - f31) / abs2;
                float f36 = ((-f17) - f30) / abs;
                float f37 = ((-f18) - f31) / abs2;
                float f38 = (f34 * f34) + (f35 * f35);
                float f39 = abs;
                float sqrt2 = (float) Math.sqrt((double) f38);
                if (f35 < 0.0f) {
                    f10 = f35;
                    f11 = -1.0f;
                } else {
                    f10 = f35;
                    f11 = 1.0f;
                }
                double d4 = (double) f11;
                double acos = Math.acos((double) (f34 / sqrt2));
                Double.isNaN(d4);
                float degrees = (float) Math.toDegrees(d4 * acos);
                float sqrt3 = (float) Math.sqrt((double) (f38 * ((f36 * f36) + (f37 * f37))));
                float f40 = (f34 * f36) + (f10 * f37);
                if ((f34 * f37) - (f10 * f36) >= 0.0f) {
                    f24 = 1.0f;
                }
                double d5 = (double) f24;
                double acos2 = Math.acos((double) (f40 / sqrt3));
                Double.isNaN(d5);
                float degrees2 = (float) Math.toDegrees(d5 * acos2);
                if (!z3) {
                    if (degrees2 > 0.0f) {
                        degrees2 -= 0.012451172f;
                    }
                } else if (degrees2 < 0.0f) {
                    degrees2 += 360.0f;
                }
                double d6 = (double) (degrees2 % 360.0f);
                int ceil = (int) Math.ceil(Math.abs(d6) / 90.0d);
                double radians2 = Math.toRadians((double) (degrees % 360.0f));
                double radians3 = Math.toRadians(d6);
                double d7 = (double) ceil;
                Double.isNaN(d7);
                float f41 = (float) (radians3 / d7);
                double d8 = (double) f41;
                Double.isNaN(d8);
                double d9 = d8 / 2.0d;
                double sin2 = (Math.sin(d9) * 1.3333333333333333d) / (Math.cos(d9) + 1.0d);
                int i = ceil * 6;
                float[] fArr = new float[i];
                int i2 = 0;
                int i3 = 0;
                while (i2 < ceil) {
                    int i4 = ceil;
                    double d10 = (double) (((float) i2) * f41);
                    Double.isNaN(d10);
                    double d11 = d10 + radians2;
                    double cos2 = Math.cos(d11);
                    double sin3 = Math.sin(d11);
                    int i5 = i3 + 1;
                    double d12 = radians2;
                    fArr[i3] = (float) (cos2 - (sin2 * sin3));
                    int i6 = i5 + 1;
                    int i7 = i;
                    fArr[i5] = (float) (sin3 + (cos2 * sin2));
                    Double.isNaN(d8);
                    double d13 = d11 + d8;
                    double cos3 = Math.cos(d13);
                    double sin4 = Math.sin(d13);
                    int i8 = i6 + 1;
                    fArr[i6] = (float) (cos3 + (sin2 * sin4));
                    int i9 = i8 + 1;
                    fArr[i8] = (float) (sin4 - (sin2 * cos3));
                    int i10 = i9 + 1;
                    fArr[i9] = (float) cos3;
                    i3 = i10 + 1;
                    fArr[i10] = (float) sin4;
                    i2++;
                    i = i7;
                    f32 = f32;
                    radians2 = d12;
                    float f42 = f6;
                    f41 = f41;
                    ceil = i4;
                    d8 = d8;
                }
                float f43 = f32;
                Matrix matrix = new Matrix();
                matrix.postScale(f39, abs2);
                matrix.postRotate(f12);
                matrix.postTranslate(f32, f33);
                matrix.mapPoints(fArr);
                int i11 = i;
                if (i11 >= 2) {
                    fArr[i11 - 2] = f6;
                    fArr[i11 - 1] = f14;
                }
                for (int i12 = 0; i12 < i11; i12 += 6) {
                    ahVar.mo9596d(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3], fArr[i12 + 4], fArr[i12 + 5]);
                }
                return;
            }
            ahVar2.mo9598f(f8, f14);
        }
    }
}

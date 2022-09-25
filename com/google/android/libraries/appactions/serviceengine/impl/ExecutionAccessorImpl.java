package com.google.android.libraries.appactions.serviceengine.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.libraries.appactions.serviceengine.api.ExecutionAccessor;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3944g.p3948b.p3949a.C52941f;
import com.google.assistant.p3944g.p3948b.p3949a.C52943h;
import com.google.assistant.p3944g.p3948b.p3949a.C52949n;
import com.google.assistant.p3944g.p3948b.p3949a.C52951p;
import com.google.assistant.p3944g.p3948b.p3949a.C52957v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63063ga;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* compiled from: PG */
public final class ExecutionAccessorImpl implements ExecutionAccessor {

    /* renamed from: c */
    private static final C59071e f398941c = C59071e.m91332i("com.google.android.libraries.appactions.serviceengine.impl.ExecutionAccessorImpl");

    /* renamed from: a */
    public final C52957v f398942a;

    /* renamed from: b */
    public final SparseArray f398943b = new SparseArray();

    /* renamed from: d */
    private final Context f398944d;

    /* renamed from: e */
    private final Executor f398945e;

    /* renamed from: f */
    private final C147913f f398946f;

    /* compiled from: PG */
    public class ImplParcelablePart implements ExecutionAccessor.ParcelablePart {
        public static final Parcelable.Creator CREATOR = new C147912e();

        /* renamed from: a */
        public final C52957v f398947a;

        /* renamed from: b */
        public final SparseArray f398948b;

        public ImplParcelablePart(Parcel parcel) {
            try {
                this.f398947a = (C52957v) ProtoParsers.m95518a(parcel, C52957v.f138849e, C62921ba.m95368a());
                int readInt = parcel.readInt();
                if (readInt >= 0) {
                    this.f398948b = new SparseArray(readInt);
                    for (int i = 0; i < readInt; i++) {
                        this.f398948b.append(parcel.readInt(), (C63063ga) ProtoParsers.m95518a(parcel, C63063ga.f170179c, C62921ba.m95368a()));
                    }
                    return;
                }
                throw new IllegalArgumentException("Broken parcel during restoring ExecutionAdapter");
            } catch (C62974ct e) {
                throw new IllegalArgumentException("Incompatible proto during restoring ExecutionAdapter", e);
            }
        }

        public ImplParcelablePart(C52957v vVar, SparseArray sparseArray) {
            this.f398947a = vVar;
            this.f398948b = sparseArray;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            ProtoParsers.m95530m(parcel, this.f398947a);
            parcel.writeInt(this.f398948b.size());
            for (int i2 = 0; i2 < this.f398948b.size(); i2++) {
                parcel.writeInt(this.f398948b.keyAt(i2));
                ProtoParsers.m95530m(parcel, (MessageLite) this.f398948b.valueAt(i2));
            }
        }
    }

    public ExecutionAccessorImpl(Context context, C147913f fVar, C52957v vVar, Executor executor) {
        this.f398944d = context;
        this.f398946f = fVar;
        this.f398942a = vVar;
        this.f398945e = executor;
    }

    /* renamed from: c */
    private static Optional m241040c(String str) {
        try {
            return Optional.ofNullable(Intent.parseUri(str, 0));
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) f398941c.mo56226d()).mo56382g(e)).mo56372aa(42268)).mo56386p("#parseIntentUri: Uri syntax error.");
            return Optional.empty();
        }
    }

    /* renamed from: b */
    public final C60870cx mo124566b(C52951p pVar, Iterator it) {
        C60870cx cxVar;
        if (!it.hasNext()) {
            ((C59052c) ((C59052c) f398941c.mo56226d()).mo56372aa(42267)).mo56386p("All execution attempts failed.");
            return C60856cj.m92900i(C52235kf.UNKNOWN);
        }
        C52943h hVar = (C52943h) it.next();
        if (hVar == C52943h.EXECUTION_MODE_UNKNOWN) {
            ((C59052c) ((C59052c) f398941c.mo56226d()).mo56372aa(42265)).mo56386p("Execution mode not recognized.");
            cxVar = C60856cj.m92900i(C52235kf.INVALID_ARGUMENT);
        } else {
            int ordinal = hVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 3) {
                    ((C59052c) ((C59052c) f398941c.mo56226d()).mo56372aa(42262)).mo56387q("Execution mode <%d> not supported yet.", hVar.f138822f);
                    cxVar = C60856cj.m92900i(C52235kf.UNIMPLEMENTED);
                } else if ((pVar.f138836a & 2) != 0) {
                    C52941f fVar = pVar.f138838c;
                    if (fVar == null) {
                        fVar = C52941f.f138810d;
                    }
                    if (!fVar.f138814c.equals("actions.intent.OPEN_APP_FEATURE")) {
                        ((C59052c) ((C59052c) f398941c.mo56226d()).mo56372aa(42261)).mo56386p("BII is not supported.");
                        cxVar = C60856cj.m92900i(C52235kf.UNIMPLEMENTED);
                    } else {
                        String str = fVar.f138813b;
                        if (str.isEmpty()) {
                            ((C59052c) ((C59052c) f398941c.mo56226d()).mo56372aa(42260)).mo56386p("Intent package not found. Check if the app is installed?");
                            cxVar = C60856cj.m92900i(C52235kf.INVALID_ARGUMENT);
                        } else {
                            Intent launchIntentForPackage = this.f398944d.getPackageManager().getLaunchIntentForPackage(str);
                            if (launchIntentForPackage == null) {
                                ((C59052c) ((C59052c) f398941c.mo56226d()).mo56372aa(42259)).mo56386p("Launcher intent was not found. Check if the app is installed?");
                                cxVar = C60856cj.m92900i(C52235kf.FAILED_PRECONDITION);
                            } else {
                                this.f398944d.startActivity(launchIntentForPackage);
                                cxVar = C60856cj.m92900i(C52235kf.OK);
                            }
                        }
                    }
                } else {
                    ((C59052c) ((C59052c) f398941c.mo56226d()).mo56372aa(42264)).mo56386p("Built in intent not found.");
                    cxVar = C60856cj.m92900i(C52235kf.INVALID_ARGUMENT);
                }
            } else if ((pVar.f138836a & 1) != 0) {
                C52949n nVar = pVar.f138837b;
                if (nVar == null) {
                    nVar = C52949n.f138829c;
                }
                if ((1 & nVar.f138831a) != 0) {
                    Optional c = m241040c(nVar.f138832b);
                    if (c.isEmpty()) {
                        ((C59052c) ((C59052c) f398941c.mo56226d()).mo56372aa(42256)).mo56386p("Android intent not valid.");
                        cxVar = C60856cj.m92900i(C52235kf.INVALID_ARGUMENT);
                    } else {
                        this.f398944d.startActivity((Intent) c.get());
                        cxVar = C60856cj.m92900i(C52235kf.OK);
                    }
                } else {
                    ((C59052c) ((C59052c) f398941c.mo56226d()).mo56372aa(42257)).mo56386p("Android intent not found.");
                    cxVar = C60856cj.m92900i(C52235kf.INVALID_ARGUMENT);
                }
            } else {
                ((C59052c) ((C59052c) f398941c.mo56226d()).mo56372aa(42263)).mo56386p("Android intent not found.");
                cxVar = C60856cj.m92900i(C52235kf.INVALID_ARGUMENT);
            }
        }
        C147891a aVar = new C147891a(this, pVar, it);
        return C60922j.m93045h(cxVar, C47810es.m84966f(aVar), this.f398945e);
    }

    /* renamed from: a */
    public final C60870cx mo124528a() {
        C60870cx cxVar;
        C52957v vVar = this.f398942a;
        if ((vVar.f138851a & 8) != 0) {
            C52951p pVar = vVar.f138854d;
            if (pVar == null) {
                pVar = C52951p.f138834f;
            }
            Iterator it = Stream.CC.m71936of((T[]) new Stream[]{Collection.EL.stream(new C62963cj(pVar.f138839d, C52951p.f138833e)), Stream.CC.m71935of(this.f398946f.f398988a)}).flatMap(C147909b.f398985a).filter(C147910c.f398986a).distinct().iterator();
            if (!it.hasNext()) {
                ((C59052c) ((C59052c) f398941c.mo56226d()).mo56372aa(42266)).mo56386p("No available execution mode found.");
                cxVar = C60856cj.m92900i(C52235kf.INVALID_ARGUMENT);
            } else {
                cxVar = mo124566b(pVar, it);
            }
        } else {
            cxVar = C60856cj.m92900i(C52235kf.INVALID_ARGUMENT);
        }
        C147911d dVar = C147911d.f398987a;
        return C60922j.m93044g(cxVar, C47810es.m84963c(dVar), this.f398945e);
    }
}

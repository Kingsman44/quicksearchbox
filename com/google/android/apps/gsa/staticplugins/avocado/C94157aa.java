package com.google.android.apps.gsa.staticplugins.avocado;

import android.app.Activity;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import com.google.android.gms.vision.face.C146308c;
import com.google.android.gms.vision.face.C146309d;
import com.google.android.gms.vision.face.internal.client.C146312b;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
import com.google.android.libraries.gcoreclient.p1739aa.p1740a.C21414b;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.aa */
/* compiled from: PG */
final class C94157aa extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    final /* synthetic */ C94276ea f263029a;

    /* renamed from: b */
    final /* synthetic */ C94170an f263030b;

    public C94157aa(C94170an anVar, C94276ea eaVar) {
        this.f263030b = anVar;
        this.f263029a = eaVar;
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Activity activity = this.f263030b.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C94158ab(activity));
        }
        ((C59052c) ((C59052c) C94170an.f263048b.mo56225c()).mo56372aa(14131)).mo56386p("#onConfigureFailed");
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C94170an anVar = this.f263030b;
        if (anVar.f263061M == null || cameraCaptureSession == null) {
            ((C59052c) ((C59052c) C94170an.f263048b.mo56226d()).mo56372aa(14132)).mo56386p("#onConfigured error.");
            return;
        }
        anVar.f263060L = cameraCaptureSession;
        try {
            C146308c cVar = anVar.f263081ag.f59886a;
            cVar.f395178c = 1;
            cVar.f395179d = 1;
            cVar.f395177b = true;
            FaceSettingsParcel faceSettingsParcel = new FaceSettingsParcel();
            faceSettingsParcel.f395201a = cVar.f395179d;
            faceSettingsParcel.f395202b = 0;
            faceSettingsParcel.f395203c = cVar.f395178c;
            faceSettingsParcel.f395204d = cVar.f395177b;
            faceSettingsParcel.f395205e = true;
            faceSettingsParcel.f395206f = -1.0f;
            anVar.f263083ai = new C21414b(new C146309d(new C146312b(cVar.f395176a, faceSettingsParcel)));
            C94276ea eaVar = this.f263029a;
            C94274dz dzVar = eaVar.f263464a;
            dzVar.f263462a.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
            C94274dz dzVar2 = eaVar.f263464a;
            dzVar2.f263462a.set(CaptureRequest.CONTROL_AF_MODE, 4);
            C94274dz dzVar3 = eaVar.f263464a;
            dzVar3.f263462a.set(CaptureRequest.CONTROL_AWB_MODE, 1);
            C94274dz dzVar4 = eaVar.f263464a;
            dzVar4.f263462a.set(CaptureRequest.CONTROL_AE_MODE, 1);
            CaptureRequest build = eaVar.f263464a.f263462a.build();
            C94170an anVar2 = this.f263030b;
            CameraCaptureSession cameraCaptureSession2 = anVar2.f263060L;
            if (cameraCaptureSession2 != null) {
                if (anVar2.f263061M != null) {
                    cameraCaptureSession2.setRepeatingRequest(build, anVar2.f263080af, anVar2.f263062N);
                    return;
                }
            }
            ((C59052c) ((C59052c) C94170an.f263048b.mo56226d()).mo56372aa(14135)).mo56386p("#onConfigured error. Session is null or already closed");
        } catch (CameraAccessException e) {
            ((C59052c) ((C59052c) ((C59052c) C94170an.f263048b.mo56225c()).mo56382g(e)).mo56372aa(14136)).mo56386p("CameraAccessException");
        }
    }
}
